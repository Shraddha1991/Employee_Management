<%-- 
    Document   : SearchEmployee
    Created on : May 26, 2016, 1:03:23 AM
    Author     : Lipi Patel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Search Employee</h1>
        <div style="width:900px;margin-left: auto;margin-right: auto">
            <form action ="/Management/ReqEmployee" method="post">
                
                <input name="emp_ssn" type="text">
                 <input name="Input" type="submit" value="Search Employee">
            </form>
            
            
           
        </div>
    </body>
</html>
