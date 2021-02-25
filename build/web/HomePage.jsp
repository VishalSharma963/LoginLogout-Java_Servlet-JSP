<%-- 
    Document   : HomePage
    Created on : Feb 25, 2021, 5:20:15 PM
    Author     : Ram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <%            
            String name = (String)session.getAttribute("user");
            
            if(name == null){
                response.sendRedirect("register.jsp");
            }            
        %>
        <h1>Hello <%= name %>!!!</h1>
        
        <form action="LogOut" method="get">
            <h1><button type="submit">LogOut</button></h1>
        </form>
    </body>
</html>
