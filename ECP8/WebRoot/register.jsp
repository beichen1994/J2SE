<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="gbk"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
		<meta charset="gbk">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">  
	    <title>顾客注册</title>
        <meta name="description" content="">
        <meta name="author" content="templatemo">
	    <link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
	    <link href="css/font-awesome.min.css" rel="stylesheet">
	    <link href="css/bootstrap.min.css" rel="stylesheet">
	    <link href="css/templatemo-style.css" rel="stylesheet">
	</head>
  
  <body class="light-gray-bg">
		<div class="templatemo-content-widget templatemo-login-widget white-bg">
			<header class="text-center">
	          <div class="square"></div>
	          <h1>注册</h1>
	        </header>
	        <form action="AddAccount" class="templatemo-login-form" method="post">
	            <div class="form-group">
	                <select class="form-control" name="account" style="width:100px;">
				          <option value=<%=1 %>>顾客</option> 
				          <option value=<%=2 %>>卖家</option>            
			        </select>       
	            </div>
	        	<div class="form-group">
	        		<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>	        		
		              	<input type="text" class="form-control" placeholder="请输入ID号" name="id">           
		          	</div>	
	        	</div>
	        	<div class="form-group">
	        		<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>	        		
		              	<input type="text" class="form-control" placeholder="请输入姓名" name="name">           
		          	</div>	
	        	</div>	
	        	<div class="form-group">
	        		<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>	        		
		              	<input type="password" class="form-control" placeholder="请输入密码" name="password">           
		          	</div>	
	        	</div>	
	        	<div class="form-group">
	        		<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>	        		
		              	<input type="password" class="form-control" placeholder="请再次输入密码" name="confirm-password">           
		          	</div>	
	        	</div>	          
				<div class="form-group">
					<button type="submit" class="templatemo-blue-button width-100">提交信息</button>
				</div>
	        </form>
		</div>
	</body>
</html>
