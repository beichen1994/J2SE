
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<html>
  <head> 
    <title>include test	</title>
  </head>
  
  <body bgcolor = "white">
  <font color ="red">
  The current date and time are
  <%@ include file = "Date.jsp" %>
  <jsp:include page="Date.jsp" flush ="true"></jsp:include>
  </font> 
  </body>
</html>
