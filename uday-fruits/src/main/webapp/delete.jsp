<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg  navbar-light bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"><img alt=""
			src="https://thumbs.dreamstime.com/z/fruit-2999796.jpg"
			alt="" width="90" height="80"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<a
				href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" /></a>
			<a href="fruits.jsp"> Order</a>
		</div>
	</div>
</nav></head>
<body>

	
	<h2  style="color:green;">Search the fruits</h2>
	<h3>
		<span style="color: red;">${message }</span>
	</h3>

	<form action="delete" method="get">

		Search by Id <input type="text" name="id" />
		 <input type="submit"
			value="search" />
	</form>

	<div>

		<h4>Search result:</h4>
		<pre>
	
	Name:${dto.name }
	Select Fruits :${dto.selectFruits }
	Quantity :${dto.quantity }
	location :${dto.location }
	Mobile Number :${dto.mobileNumber }
	</pre>
	</div>



</body>
</html>