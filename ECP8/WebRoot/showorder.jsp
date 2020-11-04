<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title>顾客主页</title>
<meta name="description" content="">
<meta name="author" content="templatemo">
<link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/templatemo-style.css" rel="stylesheet">
</head>
<body>  

    <!-- Left column -->
    <div class="templatemo-flex-row">
      <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
          <div class="square"></div>
          <h1>顾客主页</h1>
        </header>
        <div class="profile-photo-container">
          <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">  
          <div class="profile-photo-overlay"></div>
        </div>      
        <nav class="templatemo-left-nav">          
          <ul>
            <li><a href="ProductServlet"><i class="fa fa-bar-chart fa-fw"></i>首页</a></li>
            <li><a href="ShowOrder" class="active"><i class="fa fa-database fa-fw"></i>我的订单</a></li>
            <li><a href="ShowBasket"><i class="fa fa-database fa-fw"></i>购物车</a></li>
          </ul>  
        </nav>
      </div>
      <!-- Main content --> 
      <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
          <div class="row">
            <nav class="templatemo-top-nav col-lg-12 col-md-12">
              <h2>你好，欢迎来到购物系统</h2>
            </nav> 
          </div>
        </div>
         <div class="templatemo-content-container">
	  <div class="templatemo-content-widget no-padding">
		<div class="panel panel-default table-responsive">
		  <table class="table table-striped table-bordered templatemo-user-table">
		  <%if(session.getAttribute("customer")==null){response.sendRedirect("login.jsp");} else{%>
		<%ArrayList<String[]> list=(ArrayList<String[]>)session.getAttribute("orderlist"); %>
			<thead>
			  <tr>
				<td>订单号</td>
				<td>下单时间</td>
				<td>总价</td>
				<td>状态</td>
			  </tr>
			</thead>
			<tbody>
<% 
			for(String[] l : list){
			 %>
			  <tr>
				<td><a href="OrderDetail?oid=<%=l[0] %>&total=<%=l[2] %>"><%=l[0] %></a></td>
				<td><%=l[1] %></td>
				<td><%=l[2] %></td>
				<td><%=l[3] %></td>
			  </tr>
			  <%} %> 
			</tbody>
		  </table>    
		</div>                          
	  </div>          
	  
		
	  </div> <!-- Second row ends -->
	  <div class="templatemo-flex-row flex-content-row">
		
		
		
	  </div>
	  <div class="pagination-wrap">
		<ul class="pagination">
		  <li class="active"><a href="#">1</a></li>
		  <li><a href="#">2</a></li>
		  <li><a href="#">3 <span class="sr-only">(current)</span></a></li>
		  <li><a href="#">4</a></li>
		  <li><a href="#">5</a></li>
		  <li>
			<a href="#" aria-label="Next">
			  <span aria-hidden="true"><i class="fa fa-play"></i></span>
			</a>
		  </li>
		</ul>
	  </div>          
	          
	</div>
  </div>
</div>
<%} %>
</body>
</html>