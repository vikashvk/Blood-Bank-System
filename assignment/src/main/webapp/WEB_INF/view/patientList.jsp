<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>All Patient</title>
</head>
<body>
	<div>
		<h1>All Patient's list</h1>
	</div>

	<%-- <div id="pagination">

		<c:url value="/patientList" var="prev">
			<c:param name="page" value="${page-1}" />
		</c:url>
		<c:if test="${page > 1}">
			<a href="<c:out value="${prev}" />" class="pn prev">Prev</a>
		</c:if>

		<c:forEach begin="1" end="${maxPages}" step="1" varStatus="i">
			<c:choose>
				<c:when test="${page == i.index}">
					<span>${i.index}</span>
				</c:when>
				<c:otherwise>
					<c:url value="/patientList" var="url">
						<c:param name="page" value="${i.index}" />
					</c:url>
					<a href='<c:out value="${url}" />'>${i.index}</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:url value="/patientList" var="next">
			<c:param name="page" value="${page + 1}" />
		</c:url>
		<c:if test="${page + 1 <= maxPages}">
			<a href='<c:out value="${next}" />' class="pn next">Next</a>
		</c:if>
	</div> --%>
	<table class="table table-striped">
		<tr>
			<th>Patient's ID:</th>
			<th>Patient's Name:</th>
			<th>Blood Group:</th>
			<th>Phone No:</th>
		</tr>


		<c:forEach var="patient" items="${patientList}">
			<tr>

				<td>${patient.patientId}</td>

				<td>${patient.patientName}</td>

				<td>${patient.bloodGroup}</td>

				<td>${patient.phoneNum}</td>
			</tr>
		</c:forEach>


	</table>

</body>
</html>