<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FRUITS</title>
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
		<h2 style="color:green;">WELCOME........</h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" /></a>
			<a href="index.jsp"> HOME </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="search.jsp"> SEARCH </a>

		</div>
	</div>
</nav>


</head>
<body>

<h3 style="color:blue;">Order The Fruits</h3>
	<c:forEach items="${error}" var="e">
		<pre>
	<span style="color: red">${e.message}</span>
	</pre>
	</c:forEach>
	
	

<form action="fruitss" method="post">


  <div class="form-group">
    <label for="formGroupExampleInput">Customer Name</label>
    <input type="text" class="form-control" id="formGroupExampleInput" placeholder=" Enter  name " name="name"/>
  </div>
 
 Select Fruits <select class="form-select"
			aria-label="Default select example" name=selectFruits >
			<option selected value="">Select Fruits</option>
			<c:forEach items="${select}" var="c">
			<option value="${c}">${c}</option>
			</c:forEach>
			</select>



  
   <div class="form-group">
    <label for="formGroupExampleInput2">Quantity</label>
    <input type="number" class="form-control" id="formGroupExampleInput2" placeholder="Enter Quantity" name="quantity"/>
  </div>
  
   <div class="form-group">
    <label for="formGroupExampleInput2">Location</label>
    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Enter location" name="location"/>
  </div>
  
   <div class="form-group">
    <label for="formGroupExampleInput2">Mobile Number</label>
    <input type="number" class="form-control" id="formGroupExampleInput2" placeholder="Enter mobile number" name="mobileNumber"/>
  </div>
  
   <input type="submit" value="order" />
  
</form>


	
	
</body>
</html>