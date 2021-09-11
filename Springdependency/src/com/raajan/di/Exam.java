package com.raajan.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	 public static void main(String[] args) {
		 
		
	 
	 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	 Student abhi= (Student)context.getBean("student");
	 abhi.displayStudentInfo();
	 
	 Student stud=(Student)context.getBean("student2");
	 stud.displayStudentInfo();
	 
	
	 }
}

