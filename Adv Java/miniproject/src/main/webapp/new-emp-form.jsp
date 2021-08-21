<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

</head>
<body>
 <div style="position:absolute; top:0px; width: 100%"><%@ include file="component/header1.jsp" %></div>
  <main  class="form-signin text-center container h-100 d-flex justify-content-center align-items-center">
 
 <form class="col-md-4" action="InsertServlet" method="post" style="margin-top: 10%">
 <div>
 <%
 response.setHeader("Cache-Control", "no-cache, no-store, must-validate");
 response.setHeader("Pragma", "no-cache");

String email=(String)session.getAttribute("mail");
if(email ==null){
	response.sendRedirect("login1.jsp");}
%>
 <label>Name</label>
 <input class="form-control" type="text" name="empName">
 </div>
  <div>
 <label>Address</label>
 <input class="form-control" type="text" name="empAddress">
 </div>
  <div>
 <label>Mob</label>
 <input class="form-control" type="text" name="empMobile">
 </div>
  <div>
 <label>salary</label>
 <input class="form-control" type="number" name="empSalary">
 </div>
 <button type="submit">Add</button>
 </form> 
 </main>
 <div style="position:absolute; bottom:0px; width: 100%"><%@ include file="component/footer.jsp" %></div>
</body>
</html>