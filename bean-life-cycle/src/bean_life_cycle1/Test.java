package bean_life_cycle1;

import java.sql.SQLException;

public class Test {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	StudentDAO dao=new StudentDAO();
	dao.selectAllRows();
	dao.deleteQuery(4);
	dao.selectAllRows();
}
	
	

}
