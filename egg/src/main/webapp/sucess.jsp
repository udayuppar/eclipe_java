<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"/>
</head>
<body>
<h1>Welcome.......</h1>
<nav class="navbar navbar-dark bg-dark">
<a class ="navbar-brand" href="#">
<img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="90" height="60" class ="d-inline-block algin-text-top">
</a>
</nav>

<a href="index.jsp"> home page</a>

<form action="egg" method="post">
<pre>
Hotel Name <input type="text" name="hotelName"/>
Egg Dish Name <select name="dishName">
<option>Select</option> 
<option>egg Rice</option>
<option>Omlet</option>
<option>Half-Boil</option>
<option>Egg-bonda</option>
<option>Egg-Masala</option>
<option>Egg-Dosa</option>
</select>

Egg Type<select name="eggType">
<option>Select</option>
<option>Naati</option>
<option>Form</option>
<option>Ostrich</option>
<option>Dove</option>
<option>Duck</option>
</select>

Price <input type="number" name="price"/>

Quantity <select name="quantity">
<option>Select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
<option>6</option>
<option>7</option>
<option>8</option>
<option>9</option>
<option>10</option>
</select>

TakeAway yes: <input type="radio" name=takeAway value="true"/> No: <input type="radio" name=takeAway+ value="false"/>
<input type="submit", value="order" class="btn btn-primary"/>
</pre>


</form>
</body>
</html>