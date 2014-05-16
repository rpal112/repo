<%-- 
    Document   : AdaugaDepartament
    Created on : May 16, 2014, 9:13:19 AM
    Author     : rpal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>Adauga departament nou</legend>
            <form action="AdaugaDep" method="post">
                Codul este : <input type="text" name="cod"/><br>
                Numele este : <input type="text" name="nume"/><br> 
                <input type="submit" value="Adauga acest departament"/>
            </form>
        </fieldset>
    </body>
</html>
