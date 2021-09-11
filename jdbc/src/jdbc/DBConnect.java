
package jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DBConnect {
    public DBConnect(){
        int id;
        String name,address,section;
        
        String url="jdbc:mysql://localhost:3306/db_training";
                
        String user ="admin";
        String pw="nepal123";
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection conn=DriverManager.getConnection(url,user,pw);
            System.out.println("connection successful");
            // insert update delete or select
            //insert into `tbl_pereson(`id, name, address,) values (2,'ram','bhaktapur');
            String sql="insert into tbl_person(id, name, address) values (6,'ram','bhaktapur')";
            PreparedStatement pstat=conn.prepareStatement(sql);
            pstat.executeUpdate();
            System.out.println("insert succcessfully");
            conn.close();
            System.out.println("database close successfully ");
        } catch(Exception ex)
        {
        System.out.println("Error"+ex);
        }
    
    }
    public static void main(String args[])
    {
        
        new DBConnect();
    }
}
