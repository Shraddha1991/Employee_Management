<%-- 
    Document   : ReqEmployee
    Created on : May 26, 2016, 1:14:31 AM
    Author     : Lipi Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div style="width:1200px;margin-left: auto;margin-right: auto">
           <table cellpadding="10">
               <tr>
                   
                   <th>Employee SSN</th> 
              <th>First Name</th> 
              <th>Gender</th> 
             <th>Department Num</th> 
              <th>Employee type</th> 
              <th>Payment Method</th> 
                   
               </tr>
              
                
               
               <c:forEach items="${getEmpById}" var="p">
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
       </div>
    </body>
</html>
