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

<form>
    Primer valor:<br>
    <input id="v1" type="text" name="v1">
    <br>
    Segundo valor:<br>
    <input id="v2" type="text" name="v2">
    <select id="operacion" name="operacion">
        <option id="suma" value="SUMA">SUMA</option>
        <option id="resta" value="RESTA">RESTA</option>
        <option id="multiplicacion" value="MULTIPLICACION">MULTIPLICACION</option>
        <option id= "division" value="DIVISION">DIVISION</option>
    </select>

</form>
<button>Calcular</button>
<script>
    $(document).ready(function(){
        $("button").click(function(){
            var operando1 = $("#v1").val(); var operando2= $("#v2").val(); operacion= $("#operacion :selected").text();
            $.post("/MyServlet3", {
                        operando1 : operando1, operando2: operando2, operacion: operacion
                    },
                    function(data, status){
                        alert("Data: " + data + "\nStatus: " + status);
                    });
        });
    });
</script>
</body>
</html>
