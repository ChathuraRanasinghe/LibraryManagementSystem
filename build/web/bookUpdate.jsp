<%-- 
    Document   : bookUpdate
    Created on : Jun 7, 2018, 4:45:22 AM
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
        <h1>Hello World!</h1>
         <form action="UpdateBookController">
            <input type="text" name="id"/>
            <input type="text" name="name"/>
            <input type="text" name="isbn"/>
            <button type="submit" value="update">update</button>
         </form>
    </body>
</html>
