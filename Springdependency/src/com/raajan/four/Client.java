package com.raajan.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {

//		MathCheat cheat = new MathCheat();
//
//		Student student = new Student();
//		student.setMathCheat(cheat);
 ApplicationContext context=new ClassPathXmlApplicationContext("four.xml");
 Student student=(Student)context.getBean("stu",Student.class);
	student.cheating();	
	
	AnotherStudent another=context.getBean("anotherStudent",AnotherStudent.class);
	another.startCheating();

		
	}

}
