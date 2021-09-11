package bean_life_cycle2.copy;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 
	
	// understanding the flow of data 
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	StudentDAO studentDao=context.getBean("studentDAO",StudentDAO.class);
	studentDao.selectAllRows(); 
	((ClassPathXmlApplicationContext)context).close();

}
	
	

}
