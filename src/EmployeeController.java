import java.util.Scanner;

public class EmployeeController {
	private EmployeeModel model;
	private EmployeeView view;
	private Scanner scn;

	public EmployeeController(EmployeeModel newModel, EmployeeView newView){
		this.model = newModel;
		this.view = newView;
		this.scn = new Scanner(System.in);
	}

	public void getEmployee(){
		System.out.println("Insert Employee name:");
		String name = scn.nextLine();
		System.out.println("Insert Employee ID:");
		String id = scn.nextLine();
		System.out.println("Insert Employee Position:");
		String position = scn.nextLine();

		model.addEmployee(new Employee(name, id, position));
	}

	public void showEmployees(){
		if(model.getEmployeeList().size() > 0){
			for(Employee emp:model.getEmployeeList()){
				view.printEmployeeDetails(emp);
			}
		}else{
			System.out.println("Sorry! There are no employees to view!");
		}
	}

}
