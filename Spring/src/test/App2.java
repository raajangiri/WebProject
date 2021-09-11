package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pkg1.HelloWorld;

public class App2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("obj1");
		System.out.println(obj);

	}

}
