package bean_life_cycle2;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	StudentDAO studentDao=context.getBean("studentDAO",StudentDAO.class);
	studentDao.selectAllRows(); 

}
	
	

}
