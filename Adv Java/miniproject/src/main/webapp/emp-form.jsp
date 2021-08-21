<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee-form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<main>
		<div class="container col-md-5">
			<div class="card">
				<div class="card-body">
					<c:if test="${emp != null}">
						<form action="update" method="post">
					</c:if>
					<c:if test="${emp == null}">
						<form action="insert" method="post">
					</c:if>

					<caption>
						<h2>
							<c:if test="${emp != null}">
            			Edit Employee
            		</c:if>
							<c:if test="${user == null}">
            			Add New Employee
            		</c:if>
						</h2>
					</caption>

					<c:if test="${emp != null}">
						<input type="hidden" name="empId" value="<c:out value='${emp.id}' />" />
					</c:if>

					<fieldset class="form-group">
						<label> Name</label> <input type="text"
							value="<c:out value='${emp.name}' />" class="form-control"
							name="empName" required="required">
					</fieldset>

					<fieldset class="form-group">
						<label>MobileNo</label> <input type="text"
							value="<c:out value='${emp.mobile}' />" class="form-control"
							name="empMobile" required="required">
					</fieldset>


					<fieldset class="form-group">
						<label>Address</label> <input type="text"
							value="<c:out value='${emp.address}' />" class="form-control"
							name="empAddress">
					</fieldset>

					<fieldset class="form-group">
						<label>Salary</label> <input type="number"
							value="<c:out value='${emp.salary}' />" class="form-control"
							name="empSalary">
					</fieldset>

					<button type="submit" class="btn btn-success">Save</button>
					</form>
				</div>
			</div>
		</div>
	</main>
</body>
</html>