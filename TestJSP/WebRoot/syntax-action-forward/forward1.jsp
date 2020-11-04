
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>forward example</title>
  </head>
  
  
  
  <body bgcolor = red>
  	welcome!!
  	<jsp:forward page ="haha1.jsp"? name= m>
  		<jsp:param value="m" name="name"/>
  		<jsp:param value= '<% request.getParameter("name") %>' name ="oldName"/>
  		<jsp:param value = "manager" name ="roles"/>
  	</jsp:forward>  
  </body>
  
  
</html>
