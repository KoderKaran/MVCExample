import java.util.ArrayList;

public class EmployeeModel {
	private ArrayList<Employee> employeeList;

	public EmployeeModel(){
		employeeList = new ArrayList<Employee>();
	}

	public void addEmployee(Employee emp){
		this.employeeList.add(emp);
	}

	public ArrayList<Employee> getEmployeeList(){
		return this.employeeList;
	}
}