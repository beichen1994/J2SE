<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title>����Ա��ҳ</title>
<meta name="description" content="">
<meta name="author" content="templatemo">
<link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/templatemo-style.css" rel="stylesheet">
</head>
<body>  
<%if(session.getAttribute("enough")==null){response.sendRedirect("AdminServlet");} else{%>
    <!-- Left column -->
    <div class="templatemo-flex-row">
      <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
          <div class="square"></div>
          <h1>����Ա��ҳ</h1>
        </header>
        <div class="profile-photo-container">
          <img src="images/profile-photo.jpg" alt="Profile Photo" class="img-responsive">  
          <div class="profile-photo-overlay"></div>
        </div>      
        <nav class="templatemo-left-nav">          
          <ul>
            <li><a href="AdminServlet" class="active"><i class="fa fa-bar-chart fa-fw"></i>�Żݲ��Թ���</a></li>
          </ul>  
        </nav>
      </div>
      <!-- Main content --> 
      <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
          <div class="row">
            <nav class="templatemo-top-nav col-lg-12 col-md-12">
            <%String slogen=(String)session.getAttribute("slogen"); 
            	int enough=Integer.parseInt(session.getAttribute("enough").toString());
            	int reduce=Integer.parseInt(session.getAttribute("reduce").toString());%>
              <h2>��ã�����Ա</h2>
            </nav> 
          </div>
        </div>
         <div class="templatemo-content-container">
		  <form action="ChangeStrategy" class="templatemo-login-form" method="post">
	        			
		              	��<input type="text"  class="form-control" value="<%=enough %>" name="enough"  style="width:70px;height:30px">           
		          	        		
		              	��<input type="text"  class="form-control" value="<%=reduce %>" name="reduce" style="width:70px;height:30px">          
		             
	        			�����<input type="text" class="form-control" value="<%=slogen %>" name="slogen" style="width:300px;height:40px">
	        
	        <br><button type="submit"  class="templatemo-blue-button" >�޸�</button>
	        </form>  
	  
		
	  </div> <!-- Second row ends -->
	  <div class="templatemo-flex-row flex-content-row">
		
		
		
	  </div>
	  
	          
	</div>
  </div>
</div>
<%} %>
</body>
</html>