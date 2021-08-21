
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</head>
<body>
<%
String email=(String)session.getAttribute("mail");
if(email !=null){
	response.sendRedirect("profile.jsp");}
%>
 <div style="position:absolute; top:0px; width: 100%"><%@ include file="component/indexheader.jsp" %></div>
 
 <main  class="form-signin text-center container h-100 d-flex justify-content-center align-items-center">
 <form class="col-md-4" action="register-servlet" method="post" style="margin-top: 10%">
 <div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputname3" name="name">
    </div>
  </div>
  
  <div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Mob.No</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="inputmobile3" name="mobile">
    </div>
  </div>
 
  <div class="row mb-3">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" name="email">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3" name="password">
    </div>
  </div>

  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
 </main>
 
 <div style="position:absolute; bottom:0px; width: 100%"><%@ include file="component/footer.jsp" %></div>
 
</body>
</html>




