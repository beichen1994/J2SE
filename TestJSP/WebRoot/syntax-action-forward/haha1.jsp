
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>haha1.jsp</title>
  </head>
  
  
  
  <body bgcolor = blue>
  	here is the haha1 page
  	<br>
  	<%= request.getParameter("name") %>
  	<%= request.getParameter("oldNme") %>
  	<%= request.getParameter("roles") %> 
  </body>
  
  
</html>
