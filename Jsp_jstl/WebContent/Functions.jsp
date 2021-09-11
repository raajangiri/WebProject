<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="String" value="Welcome to javatpoint" />

	<c:if test="${fn:contains(String, 'javatpoint')}">
		<p>Found javatpoint string
		<p>
	</c:if>

	<c:if test="${fn:contains(String, 'JAVATPOINT')}">
		<p>Found JAVATPOINT string
		<p>
	</c:if>

	<c:set var="String" value="Welcome to javatpoint" />

	<c:if test="${fn:containsIgnoreCase(String, 'TO')}">
		<p>Found to string
		<p>
	</c:if>

	<c:if test="${fn:containsIgnoreCase(String, 'to')}">
		<p>Found string
		<p>
	</c:if>
	
		<c:set var="String" value="Welcome to javatpoint" />

	<c:if test="${fn:endsWith(String, 'javatpoint')}">
		<p>ends with javatpoint
		<p>
	</c:if>

	<c:if test="${fn:endsWith(String, 'to')}">
		<p>Found  not string
		<p>
	</c:if>
	



</body>
</html>