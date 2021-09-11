<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<jsp:useBean id="person" class="pkg1.Person"></jsp:useBean>
<jsp:setProperty property="*" name="person" />

</head>
<body>
<jsp:setProperty name="person" property="fullName" value="raajan" />
Personal Details:<br>
<jsp:getProperty name="person" property="fullName"  />

</body>
</html>