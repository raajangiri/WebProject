<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Welcome to javaTpoint'}" />


	<c:set var="income" scope="session" value="${4000*4}" />
	<p>
		Before Remove Value is:
		<c:out value="${income}" />
	</p>


	<c:catch var="catchtheException">
		<%
			int x = 2 / 0;
		%>
	</c:catch>

	<c:if test="${catchtheException != null}">
		<p>
			The type of exception is : ${catchtheException} <br /> There is an
			exception: ${catchtheException.message}
		</p>
	</c:if>


	<c:choose>
		<c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>
		<c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>
		<c:otherwise>  
       Income is undetermined...  
    </c:otherwise>
	</c:choose>

	<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}" />
		<p>
	</c:forEach>


	<c:remove var="income" />
	<p>
		After Remove Value is:
		<c:out value="${income}" />
	</p>

	<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">
		<c:out value="${name}" />
		<p>
	</c:forTokens>

	<c:url value="/index.jsp" var="completeURL">
		<c:param name="trackingId" value="786" />
		<c:param name="user" value="Nakul" />
	</c:url>
	${completeURL}
	<a href='${completeURL} '> ${completeURL} </a>
	
	<c:set var="url" value="0" scope="request" />
	<c:if test="${url<1}">
		<c:redirect url="http://javatpoint.com" />
	</c:if>
	<c:if test="${url>1}">
		<c:redirect url="http://facebook.com" />
	</c:if>
	
	




</body>
</html>