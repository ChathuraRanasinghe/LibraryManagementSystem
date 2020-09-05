<%-- 
    Document   : bookDelete
    Created on : Jun 7, 2018, 4:45:07 AM
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
       <form action="DeleteBookController">
            id:<input type="text" name="id"/>
            <button type="submit" value="Delete">Delete</button>
       </form>
    </body>
</html>
