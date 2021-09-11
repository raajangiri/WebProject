package pkg1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApp {
	public static void main(String args[])
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Student student=context.getBean("std",Student.class);
		Employee employee=context.getBean("emp",Employee.class);
		
		Message msg=context.getBean("emp",Employee.class);
		
		msg.get_message();
		
		msg=student;
		student.get_message();
		
		student.get_message();
		employee.get_message();
		
		//close
		context.close();
	}

}
