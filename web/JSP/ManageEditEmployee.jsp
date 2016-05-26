<%-- 
    Document   : ManageEditEmployee
    Created on : May 25, 2016, 4:49:47 PM
    Author     : Lipi Patel
--%>

<%@page import="dao.DataAccess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String emp_ssn = request.getParameter("emp_ssn");           
            String fname = request.getParameter("fname");
            String gender = request.getParameter("gender");
            String dnum = request.getParameter("dnum");
            String empType = request.getParameter("empType");
            String pMethod = request.getParameter("pMethod");
            
            DataAccess da = new DataAccess();
            da.edit(emp_ssn,fname,gender,dnum,empType,pMethod);
            response.sendRedirect("/Management/AllEmployees");                       
        %>
    </body>
</html>
