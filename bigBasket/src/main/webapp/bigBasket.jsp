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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>

	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			alt="" width="90" height="60" class="d-inline-block algin-text-top">


		</a> <a href="index.jsp"> HOME </a>

	</nav>

	<h1>WELCOME TO BIG BASKET SAVING...</h1>
	<c:forEach items="${error}" var="e">
		<pre>
	<span style="color: red">${e.message}</span>
	</pre>
	</c:forEach>
	<form action="bigBasket" method="post">
		<pre>
	Name <input type="text" name="name" />
	 Owner Name <input type="text" name="ownerName" />
	 Email <input type="email" name="email">
	PassWord <input type="password" name="passWord">
	Item list <select name="list">
	 				<option value="">Select</option>
	 				<c:forEach items="${lists}" var="l">
	 				<option value="${l}">${l}</option>
	 				</c:forEach>
					 </select>
	 Area <select name="area">
	 <option value="">Select</option>
	 <c:forEach items="${areas}" var="a">
	 <option value="${a}">${a}</option>
     </c:forEach>
	  </select>
	  
	  Shop number <input type="number" name="shopNumber" />
	  Shop Mobile number <input type="number" name="mobileNumber" />
	  Shop wife name<input type="text" name="wifeName" />
	 Anual income<input type="number" name="anualIncome" />
	
	
	  
	 
	 <input type="submit" value="Order" />
	</pre>
	</form>
</body>
</html>