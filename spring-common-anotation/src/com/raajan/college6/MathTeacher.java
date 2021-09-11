package com.raajan.college6;

import org.springframework.stereotype.Component;

@Component

public class MathTeacher implements Teacher {

	
	public void teach()
	{
		System.out.println(" i am your math teacher and my name is master");
	}

}
