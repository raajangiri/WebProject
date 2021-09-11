<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%-- decleeration--%>
<%! int n1,n2,n3; %>>
<%--Screplet --%>
<% 
n1=10;
n2=20;
n3=n1+n2;
%>
<%--Expression --%>

First No:<%=n1 %><br>
second No:<%=n2 %><br>
result:<%=n3 %><br>

</body>
</html>