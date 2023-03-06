<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<center><h1>Get All Users</h1></center>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>


<body>
	<div class="container mt=5">
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">id</th>
					<th scope="col">User Name</th>
					<th scope="col">Email</th>
					<th scope="col">Password</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userc}" var="uc">
					<tr>
						<th scope="row">${uc.id}</th>
						<td>${uc.username}</td>
						<td>${uc.email}</td>
						<td>${uc.password}</td>
						<td><a href="delete/${uc.id}" class="btn btn-danger">delete</a>
							<a href="update/${uc.id}" class="btn btn-primary">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br><br>
	<a href="/SpringMvcDemo">AddUser</a>
</body>
</html>