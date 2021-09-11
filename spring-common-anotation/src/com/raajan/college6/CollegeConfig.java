package com.raajan.college6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@ComponentScan(basePackages="com.raajan.college6") 
@PropertySource("classpath:raajan")

public class CollegeConfig {
	
	

}
