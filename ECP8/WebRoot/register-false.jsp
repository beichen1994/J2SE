<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="gbk"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
		<meta charset="gbk">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">  
	    <title>顾客登录</title>
        <meta name="description" content="">
        <meta name="author" content="templatemo">
	    <link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
	    <link href="css/font-awesome.min.css" rel="stylesheet">
	    <link href="css/bootstrap.min.css" rel="stylesheet">
	    <link href="css/templatemo-style.css" rel="stylesheet">
	</head>
  <body class="light-gray-bg">
		<div class="templatemo-content-widget templatemo-login-widget white-bg">
	        <form action="CustomerServlet" class="templatemo-login-form" method="post">
	        	<div class="form-group">
	        	    <h2>此身份已被注册</h2> <br>
                    <a href="register.jsp">重新注册</a>
	        	</div>          
	        </form>
		</div>
	</body>
</html>
