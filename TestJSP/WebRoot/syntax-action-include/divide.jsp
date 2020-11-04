
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>Divide</title>
  </head>
  
  
  
  <body bgcolor = "#FFFFFF"> 
  	<center>
  	<h1>
  	<% 
  		try{
  			float dividend = Float.parseFloat(request.getParameter("v1"));
  			float divisor = Float.parseFloat(request.getParameter("v2"));
  			double result = dividend/divisor;
  			out.println(dividend + "/" + divisor + "=" + result);
  			
  		} catch(Exception e){
  			out.println("不合法的被除数或除数");
  		}
  		
  	
  	%>
  </body>
  
  
</html>
