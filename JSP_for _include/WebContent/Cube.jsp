<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="calc" class="pkg.Calculator"/>

<%  
int res=calc.cube(5);  
out.print("Result is  "+res);  
%>    

</body>
</html>