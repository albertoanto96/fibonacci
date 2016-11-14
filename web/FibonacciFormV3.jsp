
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
    <input id="sucesiones" type="text" name="v1">
    <br>
    </form>
<button>calcular</button>
<h2 id="res"></h2>
<script>
    $(document).ready(function(){
        $("button").click(function(){
            var sucesiones=~$("#sucesiones").val();
            $.get("/MyServlet3",{sucesiones:sucesiones}, function(responseJson){
                var $ul = $("<ul>").appendTo($("#res"));
                $.each(responseJson,function(index,item){
                    $("<li>").text(item).appendTo($ul);
                })
            });
        });
    });

</script>

</body>
</html>

