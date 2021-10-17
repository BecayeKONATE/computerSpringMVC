<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer List</title>
</head>
<body>
	<h1>Welcome to Saraya Computer Store let's see the available computers</h1>
	<a href="/addComputer.do">Add a computer</a>
	<table>
		<thead>
		<tr>
		<td>Image</td>
		<td>Make</td>
		<td>Model</td>
		<td>Price</td>
	
		<c:forEach items="${computers }" var="computer">
			<tr>
				<td><img src="${computer.image}" width="350" height="200"></td>
				<td>${computer.make}</td>
				<td>${computer.model}</td>
				<td>${computer.price}</td>
				<td><a href="/delete.do?id=${computer.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>