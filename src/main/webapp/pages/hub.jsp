<%--
  Created by IntelliJ IDEA.
  User: HomeUser
  Date: 27.09.2022
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hub</title>
</head>
<body>

<c:if test="${sessionScope.currentUser == null}">
    <a href="/authorization/reg">Registration</a>
    <br>
    <a href="/authorization/login">Authorization</a>
    <br>
    <a href="/calculator">Card</a>
</c:if>

<c:if test="${sessionScope.currentUser != null}">
    <p>Hello ${sessionScope.currentUser.name}</p>
    <a href="/service/calculator">Calculator</a>
    <br>
    <a href="/authorization/logout">Logout</a>
    <br>
    <a href="/history">History</a>
    <br>
</c:if>
</body>
</html>
