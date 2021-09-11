package com.raajan.college3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	// this is for without @component . instead of @Component we are using bean 

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);// used if bean is not used but class is used

		College college = context.getBean("collegeBean", College.class);
		System.out.println("the college object created by spring is :" + college);

		college.test();
	}

}
