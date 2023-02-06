<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-WORKZ</title>

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

<form action="email">
<h6>Display Email:${email}</h6>
<input type="submit" value="email"/>
</form>

<form action="number">
<h6>Display Mobile Number:${MyNumber}</h6>
<input type="submit" value="number"/>
</form>

<form action="adhar">
<h6>Display Adhar Number:${AdharNumber}</h6>
<input type="submit" value="adhar"/>
</form>

<form action="age">
<h6>Display Age:${age}</h6>
<input type="submit" value="age"/>
</form>

<form action="DOB">
<h6>Display Date of Birth:${DateOfBirth}</h6>
<input type="submit" value="DOB"/>
</form>

<form action="salary">
<h6>Display Desired salary:${DesierdSalary}</h6>
<input type="submit" value="salary"/>
</form>

<form action="best">
<h6>Display Best friends name</h6>
<input type="submit" value="Bestie"/>
<ul>
<c:forEach items="${BestFreind}" var="item">
<li>${item}</li>
</c:forEach>
</ul>
</form>

<form action="visits">
<h6>Display most visited Placess</h6>
<input type="submit" value="places"/>
<ul>
<c:forEach items="${MostVisited}" var="item">
<li>${item}</li>
</c:forEach>
</ul>
</form>

<form action="skill">
<h6>Display the Skill set</h6>
<input type="submit" value="Skills"/>
<ul>
<c:forEach items="${skillSet}" var="item">
<li>${item}</li>
</c:forEach>
</ul>
</form>

<form action="collage">
<input type="submit" value="education detailse"/>
<label>DegreeName:${data.degreeName}</label><br>
<label>collageName:${data.collageName}</label><br>
<label>location:${data.location}</label><br>
<label>usnNumber:${data.usnNumber}</label><br>
<label>branch:${data.branch}</label><br>
<label>fees:${data.fees}</label><br>
<label>good:${data.good}</label><br>
<label>totalCGPA:${data.totalCGPA}</label><br>
<label>anyBackLog:${data.anyBackLog}</label><br>
<label>anyYearGap:${data.anyYearGap}</label><br>
</form>

<form action="love">
<input type="submit" value="family detailse"/>
<label>name:${family.name}</label><br>
<label>fatherName:${family.fatherName}</label><br>
<label>motherName:${family.motherName}</label><br>
<label>sisterName:${family.sisterName}</label><br>
<label>brotherName:${family.brotherName}</label><br>
<label>grandFatherName:${family.grandFatherName}</label><br>
<label>grandmotherName:${family.grandmotherName}</label><br>
<label>totalNoOfPeople:${family.totalNoOfPeople}</label><br>
<label>houseLocation:${family.houseLocation}</label><br>
<label>anyLand:${family.anyLand}</label><br>
</form>

<form action="world">
<input type="submit" value="mobile detailse"/>
<label>name:${mobile.name}</label><br>
<label>brand:${mobile.brand}</label><br>
<label>colour:${mobile.colour}</label><br>
<label>price:${mobile.price}</label><br>
<label>modelName:${mobile.modelName}</label><br>


</form>

<form action="cool">
<input type="submit" value="Bevarage detailse"/>
<label>name:${paniya.name}</label><br>
<label>brand:${paniya.brand}</label><br>
<label>price:${paniya.price}</label><br>
<label>quality:${paniya.quality}</label><br>
<label>quantity:${paniya.quantity}</label><br>
<label>brandAmbasitorName:${paniya.brandAmbasitorName}</label><br>
<label>teast:${paniya.teast}</label><br>
<label>Good:${paniya.good}</label><br>


</form>

<form action="paani">
<input type="submit" value="Chat detailse"/>
<label>name:${goobi.name}</label><br>
<label>shopName:${goobi.shopName}</label><br>
<label>shopLocation:${goobi.shopLocation}</label><br>
<label>price:${goobi.price}</label><br>
<label>quality:${goobi.quality}</label><br>
<label>goodForHealth:${goobi.goodForHealth}</label><br>
<label>noOfItems:${goobi.noOfItems}</label><br>
<label>teast:${goobi.teast}</label><br>
<label>colour:${goobi.colour}</label><br>
<label>noOfVarieties:${goobi.noOfVarieties}</label><br>
<label>flevor:${goobi.flevor}</label><br>


</form>

</body>
</html>