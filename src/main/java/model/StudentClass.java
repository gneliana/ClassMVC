package model;

public class StudentClass {
	int id;
	String firstName;
	String lastName;
	
	static int nextId = 1;
	
	public StudentClass() {
		this.id = nextId ++;
		this.firstName = "";
		this.lastName = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
			

}
