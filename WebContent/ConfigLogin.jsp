<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>


	<%!public void add() {

	}%>

	<%!public void jspInit() {

	}%>

	<%!int y = 100;%>
	<%
		int x = 10;
	%>


	<form action="ConfigLoginServlet">
		Email : <input type="text" name="email" /><br> Password : <input
			type="password" name="password" /><br> <input type="submit"
			value="Login" />
	</form>
	<br> ${msg}
	<%=x%>


</body>
</html>