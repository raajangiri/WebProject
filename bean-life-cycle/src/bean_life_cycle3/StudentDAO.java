package bean_life_cycle3;

import java.sql.Connection;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

	private String driver;
	private String url;

	private String userName;
	private String password;
	Connection con;
	Statement stmt;

	public String getDriver() {

		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("driver set");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("url set");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {

		this.userName = userName;
		System.out.println("username set");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//@PostConstruct // we dont need to call createConnection every time.

	public void init() throws ClassNotFoundException, SQLException {
		createConnection();
		System.out.println("init method called");
	}

	public void createConnection() throws ClassNotFoundException, SQLException {

		Class.forName(driver);

		con = DriverManager.getConnection(url, userName, password);

		stmt = con.createStatement();

	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		// createConnection();

		ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_person ");
		while (rs.next()) {

			int Studentid = rs.getInt(1);
			String name = rs.getString(2);
			String add = rs.getString(3);
			System.out.println(Studentid + "  " + name + "  " + add);

		}

	}

	public void deleteQuery(int value) throws ClassNotFoundException, SQLException {

		// createConnection();
		stmt.executeUpdate("DELETE FROM tbl_person where id=" + value);
		System.out.println("delection successful");

	}

//	@PreDestroy

	public void Destroy() throws SQLException {
		System.out.println("destroyed");
		con.close();
		
	}
}
