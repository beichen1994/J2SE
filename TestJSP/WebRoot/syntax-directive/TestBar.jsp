
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType = "text/html"%>


<html> <!--  ************TestBar.jsp***************** -->
  <head> 
    <title>TestBar.jsp</title>
  </head>
  
  
  
  <body width = "100%">
  <tr><td><%@ include file ="TitleBar.jsp" %></td></tr>
  <tr><td><% out.println("<p>这是用户显示区</p>"); %></td></tr>   
  </body>
  
  
</html>
