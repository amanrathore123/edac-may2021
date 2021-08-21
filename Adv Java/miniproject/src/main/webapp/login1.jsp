<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>login</title>
 <link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

 
</head>
<body>
<%
String email=(String)session.getAttribute("mail");
if(email !=null){
	response.sendRedirect("profile.jsp");}
%>
 <div style="position:absolute; top:0px; width: 100%"><%@ include file="component/indexheader.jsp" %></div>
     
<main class="form-signin text-center container h-100 d-flex justify-content-center align-items-center">
  <form class="col-md-4" action="login-servlet" method="post">
    <img class="mb-4" src="logo.png" alt="logo" width="100" height="75" style="margin-top: 60px">
    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

    <div class="form-floating">
      <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com" name="email">
      <label for="floatingInput">Email address</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="pwd">
      <label for="floatingPassword">Password</label>
    </div>

    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
    <p class="mt-5 mb-3 text-muted"> @ 2020-2021</p>
  </form>
  <%
String msg= request.getParameter("message");

if(msg!=null && !msg.isEmpty())
	out.print("<p style='color: red'>"+msg+"</p>");
%>
</main>
<div style="position:absolute; bottom:0px; width: 100%"><%@ include file="component/footer.jsp" %></div>
  
</body>
</html>