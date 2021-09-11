package bean_life_cycle3;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 
	
	// understanding the flow of data 
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
	StudentDAO studentDao=context.getBean("studentDAO",StudentDAO.class);
	studentDao.selectAllRows(); 
	//context.close();
	context.registerShutdownHook();// if we call this method we can still make a object for studentdao

}
	
	

}
