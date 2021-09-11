package pkg1;

public class Person {
	String fullName;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Person [fullName=" + fullName + "]";
	}
	

}
