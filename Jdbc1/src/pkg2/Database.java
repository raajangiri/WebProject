package pkg2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {

	public boolean connectDatabase() {
		try {
			// load Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			// connect
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// close
			conn.close();

			return (true);
		} catch (ClassNotFoundException | SQLException ex) {
			// System.out.println("Error :"+ex);

			return (false);
		}
	}

	public boolean insertRecord(Person p)

	{

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			String sql = "insert into person1 (id,full_name,contact) values (?,?,?)";
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, p.getId());
			pstat.setString(2, p.getFull_name());
			pstat.setString(3, p.getContact());
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			return (true);

		} catch (Exception ex) {
			return false;
		}
	}

	public boolean updateRecord(Person p)

	{

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			String sql = "update  person1 set full_name=?,contact=? where id=? ";
			PreparedStatement pstat = conn.prepareStatement(sql);

			pstat.setString(1, p.getFull_name());
			pstat.setString(2, p.getContact());
			pstat.setInt(3, p.getId());
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			return (true);

		} catch (Exception ex) {
			return false;
		}
	}

	public List<Person> getAll() {
		// Create variable to store arraylist of Person
		List<Person> persons = new ArrayList<Person>();
		try {
			// Load Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Get Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// Create SQL Statement
			String selectAll = "SELECT * FROM `person1`";
			PreparedStatement pstat = conn.prepareStatement(selectAll);

			// Create and execute ResultSet
			ResultSet rs = pstat.executeQuery();

			// Get data and store them in the list
			while (rs.next()) {
				Person tmp = new Person(rs.getInt(1), rs.getString(2), rs.getString(3));
				persons.add(tmp);
			}

			// Close resources
			pstat.close();
			conn.close();
		} catch (Exception ex) {

		}
		return persons;

	}

	public Person search(int id) {
		// Create variable to store arraylist of Person
		Person person = null;
		try {
			// Load Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Get Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			// Create SQL Statement
			String selectAll = "SELECT * FROM `person1` where id=?";
			PreparedStatement pstat = conn.prepareStatement(selectAll);
			pstat.setInt(1, id);

			// Create and execute ResultSet
			ResultSet rs = pstat.executeQuery();

			// Get data and store them in the list
			while (rs.next()) {
				person = new Person(rs.getInt(1), rs.getString(2), rs.getString(3));

			}

			// Close resources
			pstat.close();
			conn.close();
		} catch (Exception ex) {

		}
		return person;

	}
	
	public boolean deleteRecord(Person p)

	{

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			String sql = "delete from   person1  where id=? ";
			PreparedStatement pstat = conn.prepareStatement(sql);

//			pstat.setString(1, p.getFull_name());
//			pstat.setString(2, p.getContact());
			pstat.setInt(1, p.getId());
			pstat.executeUpdate();
			pstat.close();
			conn.close();
			return (true);

		} catch (Exception ex) {
			return false;
		}
}
}
