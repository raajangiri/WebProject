<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>welcome to page 2</h2>
USER:<%= request.getParameter("user_name") %></br>
pass:<%= request.getParameter("user_pass") %></br>
Rajan
</body>
</html>