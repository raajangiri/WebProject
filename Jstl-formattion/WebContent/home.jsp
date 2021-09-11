<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
  
<html>  
  <head>  
 <title>fmt:parseNumber tag</title>  
  </head>  
  <body>  
<h3>The fmt:parseNumber tag Example is:</h3>  
  
<c:set var="Amount" value="786.970" />  
  
    <fmt:parseNumber var="j" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  </body>  
</html> 