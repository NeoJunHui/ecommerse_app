<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
</head>
<body>
	<ul>
		<li><a class="active" href="index.jsp">Home</a></li>
		<li><a class="active" href="productManagement.jsp">Products</a></li>
		<li style="float: right"><a class="active" href="login.jsp">Login</a></li>
		<li style="float: right"><a class="active" href="register.jsp">Register</a></li>
	</ul>
	<h1>Login</h1>
	<form action=" LoginServlet" method="post">
		Name: <input type="text" name="userName"> Password: <input
			type="password" name="password"> <input type="submit"
			value="Login" />
	</form>
</body>
</html>