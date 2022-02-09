<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Db List Users</title>
</head>
<body>


	<%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>
<br><br>	<a href="DbSignup.jsp">Add Users</a>
<br><BR>  


	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>


		<%
			for (UserBean user : users) {
		%>
		<tr>
			<td><%=user.getUserId()%></td>
			<td><%=user.getFirstName()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getPassword()%></td>
			<tD><a href="DeleteUserServlet?userId=<%=user.getUserId()%>"> Delete</a>|
			
				<a  href="EditUserSerlvet?userId=<%=user.getUserId()%>">Edit</a>
			
			</tD>
		</tr>

		<%
			}
		%>

	</table>

</body>
</html>