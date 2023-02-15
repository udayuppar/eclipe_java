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
<h1>chief minister information.......</h1>
<nav class="navbar navbar-dark bg-dark">
<a class ="navbar-brand" href="#">
<img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="90" height="60" class ="d-inline-block algin-text-top">
</a>
</nav>

<a href="index.jsp"> Home page</a>

<form action="cm" method="post">
<pre>
CM name <input type="text" name="cmName"/>
Party <select name="party">
<option value="">Select</option>
<option>BJP</option>
<option>Congress</option>
<option>JDS</option>
<option>Prajakeeya</option>
<option>KJP</option>
</select>
State <select name="state">
<option value="">Select</option>
<option>KARNATAKA</option>
<option>TAMILNAADU</option>
<option>KERALA</option>
<option>ANDRAPRADESH</option>
<option>GOA</option>
</select>

Tenure <select name="tenure">
<option value="">Select</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select>

PortFolio <textarea rows="3" cols="30" name="portFolio"></textarea>
<input type="submit" value="save" class="btn btn-primary">
</pre>

</form>
</body>
</html>