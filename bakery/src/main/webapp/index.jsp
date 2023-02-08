<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>


	
	
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
<h1>Bakery Detailes</h1>

<style>
   body {
    background-image: url('https://img.freepik.com/free-vector/hand-painted-watercolor-pastel-sky-background_23-2148902771.jpg');
    background-repeat: no-repeat;
   }
        </style>

<form action="bakery" method="post">
<nav class="navbar navbar-light bg-warning">
			<!-- Navbar content -->
			<div class="container-fluid">
				<a class="navbar-brand" href="#"> <img
					src=https://media.istockphoto.com/id/1054228718/photo/indian-sweets-in-a-plate-includes-gulab-jamun-rasgulla-kaju-katli-morichoor-bundi-laddu.jpg?b=1&s=170667a&w=0&k=20&c=twNV7dVu6JUDKtnHBECoBwZxVq6gg9SlGJu1-O4h1u0=
					alt="" width="90" height="60" class="d-inline-block align-text-top">

				
				
			</div>
		</nav>
		
		
		
		<div class="col-xs-30">
		<label for="exampleFormControlInput1" >name</label>
		 <input type="text" class="form-control"id="exampleFormControlInput1" 
		 placeholder="enter name"/>
		   </div>
		   
		   <div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
			ownerName</label>
				 <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter ownerName"
				name="ownerName">
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
			wifeName</label>
				 <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter wifeName"
				name="wifeName">
		</div>
		
		<div>
		ownerMarried :yes<input type="radio" name="ownerMarried" value="true"/>
				No<input type="radio" name="ownerMarried" value="false"/>
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
			famousFor</label>
				 <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter famousFor"
				name="famousFor">
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">
			since</label>
				 <input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="enter since"
				name="since">
		</div>
		
		<button type="submit" class="btn btn-dark" value="send">send</button>


</body>
</html>