/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lipi Patel
 */
public class DBUtils
{
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
    PreparedStatement ps =  null;
    Class.forName("com.mysql.jdbc.Driver");  
     String url ="jdbc:mysql://localhost:3306/Employee_Management";
     String user="root";
     String pass="Shantala_123";
     Connection con = DriverManager.getConnection(url, user, pass);
      ps = con.prepareStatement(sql);
    return ps;
    }
    
    /* public static void main(String[] args) throws ClassNotFoundException, SQLException {
     getPreparedStatement("select * from Employee"); 
  } */
}
