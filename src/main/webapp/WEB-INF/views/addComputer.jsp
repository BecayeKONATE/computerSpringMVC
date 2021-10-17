<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Computer</title>
</head>
<body>
	<form action="addComputer.do" method="post">
		Make: <input type="text" name="mk" placeholder="make"/><br>
		Model: <input type="text" name="md" placeholder="model"/><br>
		Price: <input type="text" name="pr" placeholder="price"/><br>
		Image: <input type="text" name="img" placeholder="image"/><br>
		<input type="submit">
	</form>
</body>
</html>