
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>JSP Expressions</title>
    
	
  </head>
  
  <body>
   <h2>JSP Expressions</h2>
   <ul> 
   	<li>Current time:<%= new Date() %>
   	<li>Your hostname:<%= request.getRemoteHost() %>
   	<li>Your session:<%= session.getId() %>
   	<li>The<CODE> testParam</CODE>
   	    form parameter:<%= request.getParameter("testParam") %>
   </ul>
  </body>
</html>
