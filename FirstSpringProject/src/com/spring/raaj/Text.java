package com.spring.raaj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
	    Resturent res= (Resturent)con.getBean("resturent");
	    res.greedCustomer();
		
	}
	

}
