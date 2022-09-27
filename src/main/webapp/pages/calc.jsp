<%--
  Created by IntelliJ IDEA.
  User: HomeUser
  Date: 21.09.2022
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>calc</title>
</head>
<body>

<form action="/service/calculator" method="post">
    <input type="text" name="num1" placeholder="Num1">
    <input type="text" name="num2" placeholder="Num2">
    <select class="selectOperation" name="operation">
        <option>sum</option>
        <option>sub</option>
        <option>mul</option>
        <option>div</option>
    </select>
    <button>Submit</button>
</form>
<a> ${result.result}</a>

</body>
</html>
