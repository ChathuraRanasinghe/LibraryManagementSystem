<%-- 
    Document   : memberAdd
    Created on : Jun 7, 2018, 4:42:53 AM
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
         <form action="addMemberController">
            id:<input type="text" name="id"/>
            name:<input type="text" name="name"/>
            mobile:<input type="text" name="mobile"/>
            
            <input type="submit"/>
         </form>
    </body>
</html>
