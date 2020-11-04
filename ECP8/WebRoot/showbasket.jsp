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
            <li><a href="ProductServlet"><i class="fa fa-bar-chart fa-fw"></i>主页</a></li>
            <li><a href="ShowOrder"><i class="fa fa-database fa-fw"></i>我的订单</a></li>
            <li><a href="ShowBasket" class="active"><i class="fa fa-database fa-fw"></i>购物车</a></li>
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
		<%ArrayList<String[]> list=(ArrayList<String[]>)session.getAttribute("basketlist"); 
		double total=Double.parseDouble(session.getAttribute("total").toString());
		double realtotal=Double.parseDouble(session.getAttribute("realtotal").toString());%>
			<thead>
			  <tr>
				<td>商品</td>
				<td>商家</td>
				<td>价格</td>
				<td>数量</td>
			  </tr>
			</thead>
			<tbody>
<%for(String[] l : list){
			 %>
			  <tr>
				<td><img src="<%=l[1] %>.jpg"  width="100px" height="100px"/><%=l[1] %></td>
				<td><%=l[3] %></td>
				<td><%=l[2] %></td>
				<td><%=l[0] %></td>
			  </tr>
			  <%} %>
			  <tr>
			  <td>总计：<%=realtotal %> <span style="text-decoration:line-through;"><%=total %></span>元</td>
			  </tr>
			</tbody>
		  </table>    
		</div>                          
	  </div>          
	  <button onclick="window.location='ClearBasket'" class="templatemo-blue-button" >提交订单</button>
		
	  </div> <!-- Second row ends -->
	  <div class="templatemo-flex-row flex-content-row">
		
		
		
	  </div>
	  
	          
	</div>
  </div>
</div>
</body>
</html>