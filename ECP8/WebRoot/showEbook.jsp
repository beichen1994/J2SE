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
            <li><a href="ProductServlet" class="active"><i class="fa fa-bar-chart fa-fw"></i>首页</a></li>
            <li><a href="BookServlet"><i class="fa fa-database fa-fw"></i>图书</a></li>
            <li><a href="EbookServlet"><i class="fa fa-database fa-fw"></i>电子书</a></li>
            <li><a href="ShowOrder"><i class="fa fa-database fa-fw"></i>我的订单</a></li>
            <li><a href="ShowBasket"><i class="fa fa-database fa-fw"></i>购物车</a></li>
          </ul>  
        </nav>
      </div>
      <!-- Main content --> 
      <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
          <div class="row">
            <nav class="templatemo-top-nav col-lg-12 col-md-12">
              <h2>欢迎来到选购电子书籍</h2>
            </nav> 
          </div>
        </div>
         <div class="templatemo-content-container">
	  <div class="templatemo-content-widget no-padding">
		<div class="panel panel-default table-responsive">
		  <table class="table table-striped table-bordered templatemo-user-table">
		  <%if(session.getAttribute("Ebooklist")==null){response.sendRedirect("EbookServlet");} else{%>
		<%ArrayList<String[]> list=(ArrayList<String[]>)session.getAttribute("Ebooklist"); %>
			<thead>
			  <tr>
				<td>商品</td>
				<td>商品描述</td>
				<td>商家</td>
				<td>折扣</td>
				<td>价格</td>
				<td>商家库存</td>
				<td>选择数量</td>
				<td>操作</td>
			  </tr>
			</thead>
			<tbody>
<% 
			for(String[] l : list){
			 %>
			  <tr>
				<td><img src="<%=l[4] %>.jpg"  width="100px" height="100px"/><%=l[4] %></td>
				<td><%=l[5] %></td>
				<td><%=l[6] %></td>
				<td><%=l[7] %></td>
				<td><%=l[8] %>   <span style="text-decoration:line-through;"><%=l[3] %></span></td>
				<td><%=l[2] %></td>
				<form id="test" method="post" action="AddProduct?sid=<%=l[0] %>&pid=<%=l[1] %>">
				<td>
				<div class="col-lg-6 col-md-6 form-group">             
			  <select class="form-control" name="quantity" style="width:80px;">
				<%
            int q=Integer.parseInt(l[2]);
            for(int i=1;i<=q;i++){
                %><option value=<%=i %>><%=i %></option> 
            <%}%> 
			  </select>
			</div>
				</td>
				<td><div class="form-group text-left">
			<button type="submit" class="templatemo-blue-button" >加入购物车</button>
		  </div></td></form>
				
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