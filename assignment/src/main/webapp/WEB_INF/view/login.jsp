<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>welcome</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="wrapper">
		<div class="container">
			<h1>Welcome to Blood Bank Portal</h1>

			<f:form class="form" method="POST" action="/menu" modelAttribute="admin">
				<f:input path="adminName" type="text" placeholder="Admin name"
					required="required"/>
					<f:input path="password" type="password" placeholder="Password"
						required="required"/>
						<input type="submit" value="Login">
			</f:form>
		
			<h4>${msg}</h4>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src="js/index.js"></script>




</body>
</html>