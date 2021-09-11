package bean_life_cycle1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDAO {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db_training";

	private String user = "admin";
	private String pw = "nepal123";
	
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		// load driver
		Class.forName(driver);
		// get connection
		Connection con=DriverManager.getConnection(url,user,pw);
	
		System.out.println("hi");
		//execute Query
	    Statement stmt=con.createStatement();
	    ResultSet rs=stmt.executeQuery("SELECT * FROM tbl_person ");
	    while (rs.next())
	    {
	    	
	    	int Studentid=rs.getInt(1);
	    	String name=rs.getString(2);
	    	String add=rs.getString(3);
	    	System.out.println(Studentid);
	    	System.out.println(name);
	    	System.out.println(add);
	    	
	    }con.close();
		
	}

	public void deleteQuery( int value)throws ClassNotFoundException, SQLException
	{
		
      Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,user,pw);
		System.out.println("hi");
	    Statement stmt=con.createStatement();
	    stmt.executeUpdate("DELETE FROM tbl_person where id="+value);
	    System.out.println("delection successful");
	    con.close();
	}
}

