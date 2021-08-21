<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

</head>
<body>
<% 
response.setHeader("Cache-Control", "no-cache, no-store, must-validate");
response.setHeader("Pragma", "no-cache");

String email=(String)session.getAttribute("mail");
String pwd=(String)session.getAttribute("password");

if(email==null){
	response.sendRedirect("login1.jsp");}
	else{ %>

 <div style="position:absolute; top:0px; width: 100%"><%@ include file="component/header1.jsp" %></div>
 <main class="form-signin text-center container h-100 d-flex justify-content-center align-items-center">
 <form>
 <div>
 <img src="logo.png" class="rounded mx-auto d-block" alt="logo" style="width:25%; height:auto; margin-top: 8%;">
 </div>
 <div>
 <h3>Welcome Admin</h3>
 </div>
 </form>
 </main>
 <div style="position:absolute; bottom:0px; width: 100%"><%@ include file="component/footer.jsp" %></div>
 <% } %>
</body>
</html>