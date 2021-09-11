package com.raajan.college2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//
@Configuration //it makes this class as a configuration class i.e like in bean of  college1
@ComponentScan(basePackages="com.raajan.college2")  // ths is used to create the object for an class given in a package. work same as < context configuration  > of bean of college1. 

public class CollegeConfig {

}
