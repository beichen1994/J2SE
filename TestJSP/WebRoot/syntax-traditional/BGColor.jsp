
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>	Color Testing </title>
   
  </head>
  
  <!-- html 注释 -->
  <%-- 注释1 aaaa --%>
  <% //注释2 %>
  <% /* 注释3  */ %>
  
  <%
  String bgColor = request.getParameter("bgColor");
  boolean hasExplicitColor;
  if( bgColor != null){
  	hasExplicitColor = true;
  }else{
  	hasExplicitColor = false;
  	bgColor = "White";
  }
  
   %>
  
  <body bgcolor = "<%= bgColor %>">
  <h2 align = "center">Color Testing</h2>
  <%
  if(hasExplicitColor){
  	out.println("You supplied an explicit background color of" + bgColor + ".");
  }else{
  	out.println("Using default background color of WHITE" 
  	+ "Supply the bgColor request attribute to try" 
  	+"a standard color ,an RRGGBB value, or to see"
  	+"if your browser supports X11 color names."		
  	
  	);
  	
  }
   %>
   
  </body>
</html>
