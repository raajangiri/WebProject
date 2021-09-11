<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<jsp:useBean id="person" class="pkg1.Person" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="person" />
</head>
<body>

<% 
String name=request.getParameter("name");
%>

Setting .... <br>
<jsp:setProperty property = "fullName" name="person" value ="<%=name %>" />
reading...<br>
<jsp:getProperty name="person" property="fullName"  />

<a href="Display.jsp">display</a>

</body>
</html>