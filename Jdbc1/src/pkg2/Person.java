package pkg2;

public class Person {
	private int id;
	private String full_name;
	private String contact;
	
	public Person() {
		
		this.id = 0;
		this.full_name = "";
		this.contact = "";
	}
	
	public Person(int id, String full_name, String contact) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", full_name=" + full_name + ", contact=" + contact + "]";
	}
	
	
	

}
