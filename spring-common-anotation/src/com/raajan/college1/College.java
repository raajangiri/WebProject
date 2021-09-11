package com.raajan.college1;

import org.springframework.stereotype.Component;

@Component("collegeBean")  // this gives the id <bean id="collegeBean"> 
public class College {
	
	public void test()
	{
		System.out.println("testing is dome");
	}

}
