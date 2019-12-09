import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		EmployeeController controller = new EmployeeController(new EmployeeModel(), new EmployeeView());
		boolean keepAsking = true;
		System.out.println("Input 0 to add employee, input 1 to see all employee info.");
		while(keepAsking){
			int inp = scn.nextInt();
			if(inp == 0){
				controller.getEmployee();
			}else if(inp == 1){
				keepAsking = false;
			}else{
				System.out.println("Invalid input, please try again!");
			}
		}
		controller.showEmployees();
	}

}
