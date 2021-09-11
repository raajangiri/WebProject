package com.raajan.college3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//
@Configuration //it makes this class as a configuration class i.e like in bean of  college1
 
public class CollegeConfig {
	
	@Bean // we can also give the bean id by our self  @Bean(name="....") and also give multiple name @Bean(name={a,b})
	College collegeBean() // this collegeBean function is a bean id. or object.
	{
		
		College college=new College();
		return college;
	}

}
