public class EmployeeView {

	public void printEmployeeDetails(Employee emp){
		System.out.println("Employee " + emp.getId() + " details:");
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Position: " + emp.getPosition() + "\n");
	}

}
