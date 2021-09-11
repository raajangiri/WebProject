package pkg1;

public class Student implements Message{
	private int id;
	private String fullName;
	private String grade;
	private String section;

	public Student() {
		
		this.id = 0;
		this.fullName = "";
		this.grade = "";
		this.section = "";
	}

	public Student(int id, String fullName, String grade, String section) {

		this.id = id;
		this.fullName = fullName;
		this.grade = grade;
		this.section = section;
	}

	public Student(Student student) {

		this.id = student.id;
		this.fullName = student.fullName;
		this.grade = student.grade;
		this.section = student.section;
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", grade=" + grade + ", section=" + section + "]";
	}

	@Override
	public void get_message() {
		
		System.out.println(this.toString());
	}
	
	
}
