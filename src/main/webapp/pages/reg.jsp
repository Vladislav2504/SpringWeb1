<%--
  Created by IntelliJ IDEA.
  User: HomeUser
  Date: 25.09.2022
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>reg</title>
</head>
<body>

<s:form action="/service/reg" method="post" modelAttribute="newUser">
    <s:input path="name" placeholder="Name"/>
    <br>
    <s:errors  path="name"/>
    <br>
    <s:input path="username" placeholder="Username"/>
    <br>
    <s:errors  path="username"/>
    <br>
    <s:input type="password" path="password" placeholder="Password"/>
    <br>
    <s:errors  path="password"/>
    <br>
    <s:button>Submit</s:button>
</s:form>

</body>
</html>
