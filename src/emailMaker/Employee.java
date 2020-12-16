package emailMaker;


public class Employee{
	private String firstName, lastName, departmentName, companyName;
	
	public Employee(String firstName, String lastName) {
		this(firstName, lastName, "Guest", "Guest");
	}
	
	public Employee(String firstName, String lastName, String departmentName, String companyName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.companyName = companyName;
		System.out.println("EMAIL CREATED "+ this.firstName + this.lastName + this.departmentName + this.departmentName);
	}
	
	//Getter
	//FirstName
	public String getFirstName() {
		return firstName;
	}
	//LastName
	public String getLastName() {
		return lastName;
	}
	//Department
	public String getDepartmentName() {
		return departmentName;
	}
	//Company
	public String getCompanyName() {
		return companyName;
	}

	
	//Setter
	//FirstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//LastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//Department
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	//Company
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
