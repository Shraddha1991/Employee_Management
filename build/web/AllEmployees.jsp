<%-- 
    Document   : AllEmployees
    Created on : May 25, 2016, 12:16:43 PM
    Author     : Lipi Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Employees</title>
    </head>
    <body>
        <h1 align="center">All Employees</h1>
       <div style="width:1200px;margin-left: auto;margin-right: auto">
           <table cellpadding="10" border="1" align="center">
               <tr>
                   
                   <th>Employee SSN</th> 
              <th>First Name</th> 
              <th>Gender</th> 
             <th>Department</th> 
              <th>Employee type</th> 
              <th>Payment Method</th> 
               <th>Action</th> 
                   
               </tr>
              
                
               
               <c:forEach items="${AllEmployees}" var="p">
                   <tr>
                        <td>${p.emp_ssn}</td>
                         <td>${p.fname}</td>
                          <td>${p.gender}</td>                         
                            <td>${p.dnum}</td>
                             <td>${p.empType}</td>
                              <td>${p.pMethod}</td>
                              <td>
                                  <a href="edit?emp_ssn=${p.emp_ssn}">Edit</a>
                                  <a href="delete?emp_ssn=${p.emp_ssn}">Delete</a>
                              </td>
                        
                   </tr>  
                   
                   
               </c:forEach>
               
           </table>
           
           <form action="index.html" method="post">
               <input type="submit" name="Home" value="Home" >
           </form>
       </div>
    </body>
</html>
