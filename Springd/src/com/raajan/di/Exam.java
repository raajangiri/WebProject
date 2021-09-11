package com.raajan.di;

import org.springframework.context.ApplicationContext;

public class Exam {

	 public static void main(String[] args) {
		 
		
	 
	 ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
	    Student abhi= (Student)con.getBean("student");
	 abhi.displayStudentInfo();
	 }
}

