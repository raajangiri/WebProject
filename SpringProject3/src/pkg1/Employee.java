package pkg1;

public class Employee  implements Message{
	private int  id;
	private String fullName;
	private String officeName;
	private String departmentName;
	
	
	
public Employee() {
		
		this.id = 0;
		this.fullName ="";
		this.officeName = "";
		this.departmentName = "";
	}
	
	public Employee(int id, String fullName, String officeName, String departmentName) {
		
		this.id = id;
		this.fullName = fullName;
		this.officeName = officeName;
		this.departmentName = departmentName;
	}
	public Employee(Employee employee) {
		
		this.id = employee.id;
		this.fullName = employee.fullName;
		this.officeName = employee.officeName;
		this.departmentName = employee.departmentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", officeName=" + officeName + ", departmentName="
				+ departmentName + "]";
	}
	
	
	@Override
	public void get_message() {
		
		System.out.println(this.toString());
	}
	
}
