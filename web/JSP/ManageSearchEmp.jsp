<%-- 
    Document   : ManageSearchEmp
    Created on : May 26, 2016, 1:06:37 AM
    Author     : Lipi Patel
--%>

<%@page import="dao.DataAccess"%>
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
           System.out.print("inside manage"+emp_ssn);
            DataAccess.getEmpById(emp_ssn);
           response.sendRedirect("/Management/ReqEmployee");
            
            
            
         %>
    </body>
</html>
