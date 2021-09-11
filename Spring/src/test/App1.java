package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import pkg1.HelloWorld;

public class App1 {
	public static void main(String[] args) {
		XmlBeanFactory factory=new XmlBeanFactory (new ClassPathResource("beans.xml"));
        HelloWorld obj=(HelloWorld ) factory.getBean("obj1");
		System.out.println(obj);
	}

}
