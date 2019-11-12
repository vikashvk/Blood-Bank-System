<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body onload="loadMap()">
	<div class="wrapper">
		<div class="container">
			<h1>Patient Details</h1>

			<f:form action="donorList" modelAttribute="p">
				<f:input type="text" required="required" path="patientId"
					placeholder="Patient ID" />
				<f:input type="text" required="required" path="patientName"
					placeholder="Patient Name" />
				<f:select path="bloodGroup" required="required" placeholder="Blood Group">
					<option disabled selected value>Select your Blood Group</option>
					<option value="O+">O+</option>
					<option value="O-">O-</option>
					<option value="A+">A+</option>
					<option value="A-">A-</option>
					<option value="B+">B+</option>
					<option value="B-">B-</option>
					<option value="AB+">AB+</option>
					<option value="AB-">AB-</option>
				</f:select>

				<f:input type="number" min="99999999" max="10000000000"
					required="required" path="phoneNum" placeholder="Phone Number" />
				<f:input type="number" required="required"
					path="hospitalLocation.hospitalLat"
					placeholder="Latitude of Location" />
				<f:input type="number" path="hospitalLocation.hospitalLong"
					placeholder="Longitude of Location"></f:input>

				<f:button type="submit" value="Find Donar">Find Donar</f:button>
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
	</div>
</body>
</html>