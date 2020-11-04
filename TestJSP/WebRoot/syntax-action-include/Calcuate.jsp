
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String value1 = request.getParameter("value1");
	String value2 = request.getParameter("value2");
%>

<%	if(request.getParameter("calcuate").equals("division")){%>
	<jsp:include page="divide.jsp" flush ="true">
		<jsp:param value="<%= value1 %>" name="v1"/>
		<jsp:param value="<%= value2 %>" name="v2"/>
	</jsp:include>
	
<% }else{ %>
	<%@ include file ="multiply.jsp" %>
<% } %>