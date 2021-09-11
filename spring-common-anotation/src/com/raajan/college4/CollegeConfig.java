package com.raajan.college4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 


public class CollegeConfig {
	
	
	@Bean
	Principal principalBean()
	{
		Principal principal=new Principal();
		return principal;
	}
	
	
	@Bean  
	College collegeBean() 
	{
		
		College college=new College(principalBean());
		return college;
	}

}
