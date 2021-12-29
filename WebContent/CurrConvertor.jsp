<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="CurrencyConvertorServlet">
		INR: <input type="text" name="inr" /><br> USD: <input
			type="radio" name="curr" value="usd"><br> AUD:<input
			type="radio" name="curr" value="aud"><br> POUND:<input
			type="radio" name="curr" value="pound"><br> <input
			type="submit" value="convert" /><br>


	</form>
	<br>



	<!-- scriptlet -->
	<%
		int amount = 0;

		if (request.getAttribute("amount") == null) {

		} else {
			amount = (Integer) request.getAttribute("amount");//Object 
			out.print(amount);//PrintWriter 
		}
	%>

	<%-- 	<!-- expression -->
	<%=amount%>
 --%>





</body>
</html>