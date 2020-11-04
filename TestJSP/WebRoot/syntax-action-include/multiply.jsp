
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>Multiply</title>
  </head>
  
  
  
  <body bgcolor = "#FFFFFF">
  <center>
  <h1>
  <%
  	try{
  		float multiplicand = Float.parseFloat(request.getParameter("value1"));
  		float multiplicator = Float.parseFloat(request.getParameter("value2"));
  		double result = multiplicand*multiplicator;
  		out.println(multiplicand + "*" + multiplicator+"="+result );
  	}catch(Exception e){
  		out.println("不合法的被乘数和乘数");
  	}
   %>
  </h1>
  </center> 
  </body>
  
  
</html>
