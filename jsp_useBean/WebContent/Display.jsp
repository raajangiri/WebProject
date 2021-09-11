<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<jsp:useBean id = "person" class = "pkg1.Person" scope = "session"></jsp:useBean>
<jsp:setProperty property="*" name="person"/>
<meta charset="ISO-8859-1">
<title>Person Details</title>
</head>
<body>
	Reading...
	<jsp:getProperty property="fullName" name="person" />
</body>
</html>