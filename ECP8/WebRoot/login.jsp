<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="gbk"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
		<meta charset="gbk">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">  
	    <title>�˿͵�¼</title>
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
	          <h1>��¼</h1>
	        </header>
	        <form action="AccountSerlvet22" class="templatemo-login-form" method="post">
	            <div class="form-group">
	                <select class="form-control" name="account" style="width:100px;">
				          <option value=<%=1 %>>�˿�</option> 
				          <option value=<%=2 %>>����</option>            
			        </select>       
	            </div>
	        	<div class="form-group">
	        		<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>	        		
		              	<input type="text" class="form-control" placeholder="�������˺�" name="id">           
		          	</div>	
	        	</div>
	        	<div class="form-group">
	        		<div class="input-group">
		        		<div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>	        		
		              	<input type="password" class="form-control" placeholder="����������" name="password">           
		          	</div>	
	        	</div>	        
				<div class="form-group">
					<button type="submit" class="templatemo-blue-button width-100">��¼</button>
				</div>				
	        </form>
		</div>
		<div class="templatemo-content-widget templatemo-login-widget templatemo-register-widget white-bg">
			<p>��û���˺�? <strong><a href="register.jsp" class="blue-text">����ע��!</a></strong></p>
		</div>
	</body>
</html>
