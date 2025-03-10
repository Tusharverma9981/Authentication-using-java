<%-- 
    Document   : logout
    Created on : 13 Feb, 2025, 5:30:01 PM
    Author     : tv464
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%
            session.invalidate();
            response.sendRedirect("login.html");
            %>
            
    </body>
</html>
