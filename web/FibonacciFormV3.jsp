
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
<form>
    Primer valor:<br>
    <input type="text" name="v1">
    <br>

<form>
<button>calcular</button>

<script>
    $(document).ready(function(){
        $("button").click(function(){
            $.get("/MyServlet3", function(data,status){
                alert("data:"+data);
            });
        });
    });

</script>

</body>
</html>

