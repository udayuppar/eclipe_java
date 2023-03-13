<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
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
			src="https://thumbs.dreamstime.com/z/fruit-2999796.jpg" alt=""
			width="90" height="80"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="index.jsp"> Home page</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a class="navbar-brand" href="#"><img alt=""
			src="data:image/jpeg;base64,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" alt=""
			width="90" height="80"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<a
				href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" /></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
		</div>
	</div>
</nav>
</head>
<body style="background-image: url('https://media.istockphoto.com/id/502355288/photo/gradient-abstract-background.jpg?s=612x612&w=0&k=20&c=g5qtLLYYvvtYbMd1S9s7Zo9kBU6KsWRHBhQxu1tHeek=') ;">


	<h3 style="color: green;">Search By Name</h3>
	<h3>
		<span style="color: red;">${messege }</span>
	</h3>

	

	<div>
	<table class="table table-bordered">
	<tr>
	<th scope="col">Id</th>
	<th scope="col">Name</th>
	<th scope="col">SelectFruits</th>
	<th scope="col">Quantity</th>
	<th scope="col">Location</th>
	<th scope="col">MobileNumber</th>
	<th scope="col">Edit</th>
	<th scope="col">Delete</th>
	
	 
	</tr>
	
	<c:forEach items="${dto}" var="d">
	<tr>
	<td>${d.id}</td>
	<td>${d.name}</td>
	<td>${d.selectFruits}</td>
	<td>${d.quantity}</td>
	<td>${d.location}</td>
	<td>${d.mobileNumber}</td>
	<td> <a href="update?id=${d.id }">Edit</a></td>
	<td> <a href="delete?id=${d.id }">Delete</a></td>
	
	</tr>
	
	</c:forEach>
	</table>
	
	
	</div>



</body>
</html>