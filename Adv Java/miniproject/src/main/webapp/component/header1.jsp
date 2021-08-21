<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProfileHeader</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Payroll Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="profile.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="ListEmpServlet">List Employees</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="new-emp-form.jsp">Add Employee</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="edit-emp-form.jsp">Update Employees</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="delete.jsp">Delete Employees</a>
        </li>   
      </ul>
     <div class="d-flex">
     <a href="LogoutServlet" class="button" style="color: yellow">logout</a>
     </div>
    </div>
  </div>
</nav>
</body>
</html>