<%@ page import ="bean.*" %>


<jsp:useBean id = "cb" class ="bean.CounterBean">
</jsp:useBean>

<%--
		<% CounterBean cb = new CounterBean(); %>
--%>

	
	<jsp:setProperty  name="cb" property=" count" value ="23"/>
	<jsp:getProperty name ="cb" property ="count"/>
	
	<%--	
		<% cb.setCount(23) %>
	    <%= cb.getCount() %>
	 --%>
	
