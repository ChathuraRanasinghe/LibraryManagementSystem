<%-- 
    Document   : memberUpdate
    Created on : Jun 7, 2018, 4:44:08 AM
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
         <form action="UpdateMemberController">
            <input type="text" name="code"/>
            <input type="text" name="name"/>
            <input type="text" name="age"/>
            <button type="submit" value="update">update</button>
    </body>
</html>
