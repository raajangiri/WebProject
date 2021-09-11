package pkg1;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student(1,"raajan","engg","A");
		Employee e1=new Employee(1,"raj","abc","boss");
//		System.out.println(s1);
//		System.out.println(e1);
		
		Message m1=new Student(2,"raajan","eng","B");
		//Message m2=new Message();  not possible
		m1.get_message();
		
		//or 
		Student s2=new Student(2,"raa","en","c");
		//Message m2=new Message();  not possible
		Message m2=s2;
		
		m2.get_message();
	// now we can change value by settter other wise we cannot change the value 	
		
		Employee e2=new Employee(2,"ram","ad","acc");
		Message m3;
		m3=e2;
		m3.get_message();
		m3=s2;
		m3.get_message();
		
		
	

	}

}
