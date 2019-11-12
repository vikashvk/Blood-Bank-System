<!DOCTYPE html>
<html lang="en">
<head>
<title>Menu</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
.body{bg-color:red
}
h1 {
	text-align: center;
	color: rgb(5, 105, 141);
	font-weight: lighter;
	margin: 0 0 40px;
}
</style>
</head>
<body>

	<div class="container">

		<table class="table table-striped">
			<thead>
				<tr>
					<th><center>
							<h1>
								<b>MENU</b>
							</h1></th>

				</tr>
			</thead>
			<tbody>
				<tr class="table table-striped">
					<td><a href="patientList"><h5>
								VIEW all Patients
								<h5></a></td>
				</tr>

				<tr class="table-success">
					<td><a href="add"><h5>
								ADD Patient Details
								<h5></a></td>

				</tr>

				<tr class="table table-striped">
					<td><a href="donors"><h5>
								VIEW all Donors available
								<h5></a></td>
				</tr>

			</tbody>
		</table>
		<td><span class="label label-danger"><button
					class="btn btn-danger btn-s" onclick="location.href='logout'">Logout</button></span></td>
	</div>

</body>
</html>