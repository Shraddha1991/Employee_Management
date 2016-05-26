<%-- 
    Document   : ManagerAddNew
    Created on : May 25, 2016, 12:07:17 PM
    Author     : Lipi Patel
--%>

<%@page import="java.util.List"%>
<%@page import="dao.DataAccess"%>
<%@page import="model.Employee"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
           String emp_ssn=request.getParameter("emp_ssn");
           String fname=request.getParameter("fname");
           String gender=request.getParameter("gender");
           String dnum=request.getParameter("dnum");
           String empType=request.getParameter("empType");     
           String pMethod=request.getParameter("pMethod");
           
            Employee e=new Employee(emp_ssn,fname,gender,dnum,empType,pMethod);
            DataAccess da=new DataAccess();
            da.addNew(e);
            response.sendRedirect("/Management/AllEmployees");
           
            %>
    </body>
</html>
