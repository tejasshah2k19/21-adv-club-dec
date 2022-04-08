<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<c:set var="a" value="10">
	</c:set>


	<c:if test="${a % 2 == 0  }">
	EVEN <c:out value="${a}"></c:out>
	</c:if>

	<c:if test="${a % 2 != 0  }">
	ODD <c:out value="${a}"></c:out>
	</c:if>

	<%-- <c:remove var="${a}"/>
 --%>
	<c:set var="days" value="mon,tue,wen,thus,fri"></c:set>

	<br>

	<c:forTokens items="${days }" delims="," var="day">
	${day }<br>
	</c:forTokens>

	<br>
	<br>
	<c:forEach var="i" begin="1" end="10" step="2">
${i}
</c:forEach>



	<br>

	<c:set value="3" var="ch"></c:set>

	<c:choose>

		<c:when test="${ch == 1 }">
		case 1: 
	</c:when>
		<c:when test="${ch == 3}">
		case 3: 
	</c:when>
		<c:otherwise>
		default
	</c:otherwise>

	</c:choose>


	<c:if test="${ch == 5  }">
		<c:redirect url="http://www.google.com"></c:redirect>
	</c:if>



</body>
</html>