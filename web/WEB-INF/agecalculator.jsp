<%-- 
    Document   : agecalculator
    Created on : 27-Jan-2023, 11:16:33 AM
    Author     : kaurr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="age" >
            Enter your age: <input type ="text" name ="age"> <br>
            
            <input type = "submit"  value ="Age next birthday">
        </form>
        <p>${error}</p>
       
        <p><a href="arithmetic">Arithmetic Calculator</a></p>
    </body>
</html>
