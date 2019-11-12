<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Donors</title>
</head>
<body>
	<div>
		<h1>
			<center>Available Donor Details
		</h1>
	</div>

	<table class="table table-striped">
		<tr>
			<th>User Name:</th>
			<th>Phone No:</th>
			<th>Email:</th>
			<th>Blood Group:</th>
		</tr>

		<c:forEach var="donor" items="${donorList}">
			<tr>
				<td>${donor.name}</td>
				<td>${donor.phNum}</td>
				<td>${donor.eMail}</td>
				<td>${donor.bloodGroup}</td>
		</c:forEach>


	</table>
</body>
</html>