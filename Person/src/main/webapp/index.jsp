<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PersonServlet application</h1>

	
<form action="fav" method="post">
<pre>
firstName<input type="text" name="fName"/>
lastName<input type="text" name="lName"/>
<label for="gender">Gender</label><select name="gender">
<option value="male">Male</option>
<option value="female">Female</option>
<option value="others">Others</option>
</select>
reason<input type="text" name="reason"/>
address<textarea rows="5" cols="25" name="address"></textarea>
<input type="submit" value="send"/>
</pre>
</form>
	
</body>
</html>