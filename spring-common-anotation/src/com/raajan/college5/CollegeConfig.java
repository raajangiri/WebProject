package com.raajan.college5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 


public class CollegeConfig {
	
	@Bean
	Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	
	
	@Bean
	Principal principalBean()
	{
		Principal principal=new Principal();
		return principal;
	}
	
	
	@Bean  
	College collegeBean() 
	{
		
		College college=new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}

}
