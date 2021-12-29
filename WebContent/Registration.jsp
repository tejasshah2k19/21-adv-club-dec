<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="RegisterServlet" method="post">

		FirstName : <input type="text" name="firstName"
			value="${firstNameValue}" /> ${firstNameError} <BR> Email : <input
			type="text" name="email" value="${emailValue}" /> ${emailError } <br>

		Password : <input type="password" name="password" /><br>
		ConfirmPassword : <input type="password" name="confirmPassword" /><br>

		Gender : Male <input type="radio" name="gender" value="male" />
		Female <input type="radio" name="gender" value="female" /> <br>

		City : <select name="city">
			<option value="-1" > ---Select City----</option>
			<option value="ahd"  <%= request.getAttribute("cityValue")!= null && request.getAttribute("cityValue").equals("ahd")?"selected=selected":"" %>    >Ahmedabad</option>
			<option value="baroda"  <%= request.getAttribute("cityValue")!= null && request.getAttribute("cityValue").equals("baroda")?"selected=selected":"" %> >Baroda</option>
			<option value="ad"  <%= request.getAttribute("cityValue")!= null && request.getAttribute("cityValue").equals("ad")?"selected=selected":"" %> >Anand</option>

		</select> 
		${cityError }
		<br> <input type="submit" value="Register" />
	</form>


	<script>
		function save() {

			document.getElementById("formId").submit();
		}
	</script>


</body>
</html>