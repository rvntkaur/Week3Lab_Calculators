 <%-- 
    Document   : arithmeticcalculator
    Created on : 27-Jan-2023, 5:56:25 PM
    Author     : kaurr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic" >
            First: <input type ="text" name ="first"> <br>
            Second: <input type ="text" name ="second"> <br>
            <input  type = "submit"  name = "op"  value ="+">
            <input  type = "submit"  name = "op"  value ="-">
            <input  type = "submit"  name = "op"  value ="*">
            <input  type = "submit"  name = "op"  value ="%">
        </form>
         <p>${error}</p>
        
        <p><a href="age">Arithmetic Calculator</a></p>
    </body>
</html>
