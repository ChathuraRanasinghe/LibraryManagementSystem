<%-- 
    Document   : bookAdd
    Created on : Jun 7, 2018, 4:44:31 AM
    Author     : Abans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/addBookController">
            id:<input type="text" name="id"/>
            name:<input type="text" name="name"/>
            isbn:<input type="text" name="isbn"/>
            
            <input type="submit"/>
        </form>
    </body>
</html>
