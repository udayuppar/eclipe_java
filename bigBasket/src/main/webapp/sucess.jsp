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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="90" height="60" class="d-inline-block algin-text-top">

		</a> <a href="bigBasket.jsp"> BIG BASKET</a>

	</nav>
	
		<h2 style="color:green">information is saved sucessfully add more click hear Big Basket</h2>
	
	<h4> Name : ${name}</h4>
	<h4> Owner Name : ${ownerName}</h4>
	<h4> Email : ${email}</h4>
	<h4> PassWord : ${passWord}</h4>
	<h4> List : ${list}</h4>
	<h4> Area : ${area}</h4>
	<h4> shopNumber : ${shopNumber}</h4>
	<h4> Mobile Number : ${mobileNumber}</h4>
	<h4> WifeName : ${wifeName}</h4>
	<h4> AnualIncome : ${anualIncome}</h4>
</body>
</html>