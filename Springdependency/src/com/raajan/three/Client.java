package com.raajan.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		MathCheat cheat = new MathCheat();
//f
//		Student student = new Student();
//		student.setMathCheat(cheat);
 ApplicationContext context=new ClassPathXmlApplicationContext("three.xml");
 Student student=context.getBean("stu",Student.class);
	student.cheating();	
	
	AnotherStudent another=context.getBean("anotherStudent",AnotherStudent.class);
	another.startCheating();	 
		
	}

}
