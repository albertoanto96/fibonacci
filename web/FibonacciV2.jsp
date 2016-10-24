<%--
  Created by IntelliJ IDEA.
  User: alber
  Date: 24/10/2016
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Fibonacci</title>
    <table style="width:100%">
        <tr>
            <th>Valor</th>
        </tr>

        <p><%int[] stArray= (int[]) request.getAttribute("fibo"); int i=0;%></p>
        ${fibo};
        <c:forEach items="${fibo}" var="fibo">
            <tr>
                <td>c:out value="${fibo}"</td>
            </tr>
        </c:forEach>
    </table>
</head>
<body>

</body>
</html>
