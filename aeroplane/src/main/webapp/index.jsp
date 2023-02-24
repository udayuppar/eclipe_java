<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ARI CRAFT</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg  navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><img alt="" src="data:image/jpeg;base64,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" alt="" width="90" height="80"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
      
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#"></a>
          <a href="aeroplane">REGISTRATION</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </li>
      
        
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#"></a>
          <a href="search.jsp">SEARCH</a>
        </li>
    
      </ul>
    </div>
  </div>
</nav>
<body>

<h2 style="color:red;">WELLCOME TO AIRCRAFT REGISTRATION....</h2>

</body>
</html>