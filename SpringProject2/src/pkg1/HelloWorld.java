package pkg1;

public class HelloWorld {
	private String message;

	public HelloWorld() {

	}

	public HelloWorld(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
