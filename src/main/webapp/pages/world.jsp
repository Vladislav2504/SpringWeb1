
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>World</title>
</head>
<body>
<h1>Hello ${name} ${age}</h1>

<form action="/hello/world" method="post">
	<input type="text" name="name" placeholder="Name">
	<input type="text" name="username" placeholder="Username">
	<input type="text" name="password" placeholder="Password">
	<button>Submit</button>
</form>
<p>${user}</p>
</body>
</html>
