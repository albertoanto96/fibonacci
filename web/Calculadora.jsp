<%--
  Created by IntelliJ IDEA.
  User: alber
  Date: 19/10/2016
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculadora</title>

    <form action="/MyServlet" method="post">
        <select operacion="operacion" name="operacion">
            <option value="SUMA">SUMA</option>
            <option value="RESTA">RESTA</option>
            <option value="MULTIPLICACION">MULTIPLICACION</option>
            <option value="DIVISION">DIVISIÓN</option>
        </select>
        Operando 1:<br>
        <input type="number" name="operando1" value=""><br>
        Operando 2:<br>
        <input type="number" name="operando2" value=""><br>
        <input type="submit" value="Submit">
    </form>



</head>
<body>

</body>
</html>
