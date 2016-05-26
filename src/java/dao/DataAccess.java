/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;

/**
 *
 * @author Lipi Patel
 */
public class DataAccess 
{
    public void addNew(Employee e) throws ClassNotFoundException
    {
        try 
        {
            
           
            PreparedStatement ps=DBUtils.getPreparedStatement("insert into Employee values(? ,? ,? ,? ,?,?)");
            ps.setString(1, e.getEmp_ssn());
            ps.setString(2, e.getFname());
            ps.setString(3, e.getGender());         
            ps.setString(4, e.getDnum());
            ps.setString(5, e.getEmpType());
            ps.setString(6, e.getpMethod());
            ps.executeUpdate();
           
        } 
        catch (SQLException ex) 
        {
            System.out.printf("Employee record already exists");
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Employee> getAll() throws ClassNotFoundException
    {
        List<Employee> ls=new LinkedList<>();
        try {
            ResultSet rs=  (ResultSet) DBUtils.getPreparedStatement("select e.emp_ssn,e.eName,e.Gender, d.Dname,e.empType,p.pTitle from Employee e ,Department d,paymentmethod p where e.dnum=d.dnum and e.pMethod=p.pMethod ").executeQuery();
            while(rs.next())
            {
                Employee ep=new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ls.add(ep);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    
    public static List<Employee> getEmpById(String id) throws ClassNotFoundException
    {
        System.out.print("inside dao"+id);
        List<Employee> ls=new LinkedList<>();
        String sql="select * from Employee where emp_ssn="+id;
        try 
        {
            ResultSet rs=  (ResultSet) DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next())
            {
                Employee ep=new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ls.add(ep);
            
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    
    public void edit(String emp_ssn,String fname,String gender,String dnum,String empType,String pMethod) throws ClassNotFoundException
    {
       
        try
        {
            String sql="update employee SET  eName = ?, gender = ?, dnum= ?, empType = ?,pMethod=?" + " where emp_ssn = ?";
            PreparedStatement ps= DBUtils.getPreparedStatement(sql);
             ps.setString(1, fname);
            ps.setString(2, gender);
            ps.setString(3, dnum);         
            ps.setString(4, empType);
            ps.setString(5, pMethod);           
            ps.setString(6, emp_ssn);
            ps.executeUpdate();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void delete(String id)
    {
         String sql="delete from employee where emp_ssn=?";
         try
         {
              PreparedStatement ps= DBUtils.getPreparedStatement(sql);
               ps.setString(1, id);
               ps.executeUpdate();
             
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
    }
   
}
