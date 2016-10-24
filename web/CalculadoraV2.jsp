<%--
  Created by IntelliJ IDEA.
  User: alber
  Date: 24/10/2016
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Calculadora</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
<h1>Calculadora</h1>

<form action="/MyServlet2" method="post">
    Operando 1:<br>
    <input type="number" name="operando1" step="any"><br>
    Operando 2:<br>
    <input type="number" name="operando2" step="any"><br>
    <select operacion="operacion" name="operacion">
        <option value="SUMA">SUMA</option>
        <option value="RESTA">RESTA</option>
        <option value="MULTIPLICACION">MULTIPLICACION</option>
        <option value="DIVISION">DIVISIÓN</option>
    </select>

    <input type="submit" value="Submit">
</form>
</body>
</html>
