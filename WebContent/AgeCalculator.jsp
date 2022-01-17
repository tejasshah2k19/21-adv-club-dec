<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>

<form action="FindAgeSerlvet">
	
	Name : <input type="text" name="name">${nameError} <br><br>
	Birth Year : <input type="text" name="byear"> ${error} <br><br>
	<input type="submit" value="Find My Age"/> 
</form>

</body>
</html>