
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Fibonacci</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>
<body>
<h1>Fibonacci</h1>
<form action="/MyServlet2" method="get">
    Selecciona la cantidad de sucesiones:<br>
    <input type="number" name="sucesiones"><br>
    <input id="button" type="submit" value="Submit">
</form>

</body>
</html>
