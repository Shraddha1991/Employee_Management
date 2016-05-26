<%-- 
    Document   : EditEmployee
    Created on : May 25, 2016, 4:31:40 PM
    Author     : Lipi Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
    </head>
    <body>
        <h1 align="center">Edit Employee</h1>
        <br>
        <br>
        <br>
        <div style="width:900px;margin-left: auto;margin-right: auto">
            <c:forEach items="${getEmpById}" var="p">
            <form action ="JSP/ManageEditEmployee.jsp" method="post">
            <table>
                <tr>
                    <th>Emp SSN</th>
                    <td><input name="emp_ssn" type=hidden" value="${p.emp_ssn}"></td>
                </tr>
                
                <tr>
                    <th>First Name</th>
                    <td><input name="fname" type=text" value="${p.fname}"></td>
                </tr>
                
                               
                <tr>
                    <th>Gender</th>
                    <td>
                        <select name="gender">
                            
                            <option value="F">Female</option>
                             <option value="M">Male</option>
                        </select>
                    </td>
                </tr>
                
             
                <tr>
                    <th>Department Number</th>
                    <td><input name="dnum" type=text" value="${p.dnum}"></td>
                </tr>
                
                <tr>
                    <th>Employee Type</th>
                    <td>
                         <select name="empType">                          
                            <option value="Part time">Part time</option>
                             <option value="Full time">Full time</option>
                             <option value="Intern">Intern</option>
                        </select>
                    </td>
                </tr>
                
                
                 <tr>
                    <th>Payment Method</th>
                    <td>
                         <select name="pMethod" >
                             
                            <option value="1">Hourly</option>
                             <option value="2">Yearly</option>
                             
                        </select>
                    </td>
                </tr>
                
                
            </table>
          <input name="Input" type="submit" value="Edit">
        
           
     
            
        </form>
            
            
            
            </c:forEach>
              
             
         </div>
    </body>
</html>
