<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<p><font color="red">${errorMessage }</font></p>
	<form action="login.do" method="post">
		<label>Username:</label>
		<input type="text" name="nom"><br>
		<label>Password:</label>
		<input type="password" name="pass"><br>
		<input type="submit">
	</form>
</body>
</html>