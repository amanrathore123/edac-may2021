<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="pojo.Employee,java.util.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListOfEmp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">


</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-validate");
	response.setHeader("Pragma", "no-cache");
	System.out.println(session.getAttribute("mail"));
	if (session.getAttribute("mail") == null) {
		System.out.println(session.getAttribute("mail"));
		response.sendRedirect("login1.jsp");
	} else {
		List<Employee> emplist = (List<Employee>) session.getAttribute("list");

		for (Employee e : emplist)
			System.out.println("inside jsp :" + e);
	%>
	 <div style="position:absolute; top:0px; width: 100%"><%@ include file="component/header1.jsp" %></div>
	  <main class="form-signin text-center container h-100 d-flex justify-content-center align-items-center">
	<table class="table table-dark table-striped table-hover"  style=" height:auto; margin-top: 8%;" >
		<thead>
			<tr>
				<th scope="col">empId</th>
				<th scope="col">empName</th>
				<th scope="col">empMobile</th>
				<th scope="col">empAddress</th>
				<th scope="col">empSalary</th>
			</tr>
		</thead>
		<tbody scope="row">
			<%
			for (int i = 0; i < emplist.size(); i += 1) {
			%>
			<tr>
				<td><%=emplist.get(i).getEmpId()%></td>
				<td><%=emplist.get(i).getEmpName()%></td>
				<td><%=emplist.get(i).getEmpMobile()%></td>
				<td><%=emplist.get(i).getEmpAddress()%></td>
				<td><%=emplist.get(i).getEmpSalary()%></td>
			</tr>
			<%
			}
			}
			%>

		</tbody>


	</table>
	</main>
	<div style="position:absolute; bottom:0px; width: 100%"><%@ include file="component/footer.jsp" %></div>
<!--
	<table>
		<c:forEach var="emp" items="${emplist}">
			<tr>
				<td><c:out value="${emp.empIid}" /></td>
				<td><c:out value="${emp.empName}" /></td>
				<td><c:out value="${emp.empMobile}" /></td>
				<td><c:out value="${emp.empAddress}" /></td>
				<td><c:out value="${emp.empSalary}" /></td>
			</tr>
		</c:forEach>
	</table>
	-->
</body>
</html>