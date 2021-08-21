<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee list</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<div style="position:absolute; top:0px; width: 100%"><%@ include file="component/header1.jsp" %></div>
<main>
<div class="row">
		
		<div class="container">
			<h3 class="text-center">List of Employees</h3>
			<hr>
			<div class="container text-left">  
				<a href="new-emp-form.jsp" class="btn btn-success">Add
					New Employee</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Address</th>
						<th>Salary</th>
						<th>MobileNo</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					
					<c:forEach var="emp" items="${listEmp}">

						<tr>
							<td><c:out value="${emp.empIid}" /></td>
							<td><c:out value="${emp.empName}" /></td>
							<td><c:out value="${emp.empAddress}" /></td>
							<td><c:out value="${emp.empSalary}" /></td>
							<td><c:out value="${emp.empMobile}" /></td>
							<td><a href="edit-emp-form?id=<c:out value='${emp.empId}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="DeleteServlet?id=<c:out value='${emp.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>

</main>

<div style="position:absolute; bottom:0px; width: 100%"><%@ include file="component/footer.jsp" %></div>
 
</body>
</html>