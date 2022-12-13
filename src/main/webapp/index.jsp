<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecommerce</title>
<style>
.card {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	transition: 0.3s;
	width: 40%;
}

.card:hover {
	box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);
}

.container {
	padding: 2px 16px;
}

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
</head>

<body>
	<ul>
		<li><a class="active" href="index.jsp">Home</a></li>
		<li><a class="active" href="productManagement.jsp">Products</a></li>
	</ul>
	<br>
	<h1>Welcome user!</h1>
	<h2>New Products</h2>
	<div class="row">
		<div class="container">
			<div class="card">
				<h1 name="name">Ear piece</h1>
				<h2>Electronic</h2>
				<p name="price">$20.99</p>
			</div>
			<br>
			<div class="card">
				<h1 name="name">Headphone</h1>
				<h2>Electronic</h2>
				<p name="price">$35.50</p>
			</div>
		</div>
	</div>
</body>
</html>