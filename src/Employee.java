public class Employee {
	private String name;
	private String id;
	private String position;

	public Employee(String newName, String newID, String newPosition){
		this.name = newName;
		this.id = newID;
		this.position = newPosition;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String newId) {
		this.id = newId;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String newPosition) {
		this.position = newPosition;
	}
}
