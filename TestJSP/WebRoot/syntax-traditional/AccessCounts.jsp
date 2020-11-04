
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>JSP Declarations	</title>
    <meta name = "author" content = " Marty Hall">
    <meta name = "keywords" content = " JSP,declarations,JavaServer">
    <meta name = "description" content = " A quick example of JSP declaration">
    
  </head>
  
  <body>
  <h1>JSP Declarations</h1>>
  
  <%!
  		int accessCount = 0;   //全局变量
  		void m(){}
   %> 
   
   <%
   		int accessCount2 = 0;  //局部变量
    %>
   
   <h2>Accesses to page since server reboot:
   
   <%=	++accessCount %> 
   <br>
   <%= 	++accessCount2 %>
   </h2>
   
  </body>
  
</html>
