<%@page import="com.example.demo.model.VendorServiceProvided"%>
<%
   		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
   		response.setHeader("Pragma", "no-cache");
   		
   			if(session.getAttribute("user")==null)
   				response.sendRedirect("/vendorlogin");
%>
<%@page import="com.example.demo.model.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.example.demo.model.ProductCategory"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Caraft</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- owl carousel style -->
      <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.0.0-beta.2.4/assets/owl.carousel.min.css" />
      <!-- bootstrap css -->
      <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
      <!-- style css -->
      <link rel="stylesheet" type="text/css" href="css/style.css">
      <!-- Responsive-->
      <link rel="stylesheet" href="css/responsive.css">
      <!-- fevicon -->
      <link rel="icon" href="images/fevicon.png" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <!-- owl stylesheets --> 
      <link rel="stylesheet" href="css/owl.carousel.min.css">
      <link rel="stylesheet" href="css/owl.theme.default.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <style>
      .horizontal-scrollable > .row {
            overflow-x: auto;
            white-space: normal;
            display: flex;
        }
          
        .horizontal-scrollable > .row > .col-lg-2 .col-md-5 > .beds_section {
            display: inline-block;
            white-space: normal;
            float: none;
        }
        
        .btn {
  background-color: DodgerBlue;
  border: none;
  color: white;
  padding: 12px 16px;
  font-size: 16px;
  cursor: pointer;
}

/* Darker background on mouse-over */
.btn:hover {
  background-color: RoyalBlue;
}
      </style>
   </head>
   <body>
       <!--header section start -->
      <div class="header_section">
         
            <nav class="navbar navbar-dark ">
             <a class="logo" href="/"><img src="images/sep.jpg"></a>
             
               <div class="search_section">
                 
               </div>
               <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample01" aria-controls="navbarsExample01" aria-expanded="false" aria-label="Toggle navigation">
               <span class="navbar-toggler-icon"></span>
               </button>
               
               <div class="collapse navbar-collapse" id="navbarsExample01" style="padding-left: 2%">
                  <ul class="navbar-nav mr-auto">
                     <li class="nav-item active">
                        <a class="nav-link" href="/vhome">Home</a>
                     </li>
                     <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" id="navbarsExample01" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					            Products

					        
					          </a>

					  
					          <ul class="dropdown-menu " aria-labelledby="navbarsExample01">
					            <li><a class="dropdown-item" href="/addproductcategory">Add Products Category</a></li>
					            <li><a class="dropdown-item" href="/viewproductcategorys">View Products Category</a></li>
					            <li><a class="dropdown-item" href="/addproduct">Add Products</a></li>
					            <li><a class="dropdown-item" href="/viewproducts">View Products</a></li>
					          </ul>
          				 
			        </li>
			        <li class="nav-item dropdown">
                     <a class="nav-link dropdown-toggle" href="#" id="navbarsExample01" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					            Service
					          </a>
					          <ul class="dropdown-menu " aria-labelledby="navbarsExample01">
					            <li><a class="dropdown-item" href="/addservicecategory">Add Service Category</a></li>
					            <li><a class="dropdown-item" href="/viewservicecategorys">View Service Category</a></li>
					            <li><a class="dropdown-item" href="/addservice">Add Service</a></li>
					            <li><a class="dropdown-item" href="/viewservices">View Service</a></li>
					          </ul>
          				 
			        </li>
                     <li class="nav-item">
                        <a class="nav-link" href="/vendorlogin">Logout</a>
                     </li>
                  </ul>
               </div>
            </nav>
         </div>
        
      </div>
      <!--header section end -->
      
                 
      <!--category section start -->
     <div class="container">
         <div class="category_section">
            <div class="row">
               <div class="col-lg-2 col-sm-12">
                
                <h1 class="category_text">Category</h1>
               </div>
               
               <div class="col-lg-10 col-sm-12 main">
              <% 
              	ArrayList<ServiceCategory> scList = (ArrayList) request.getAttribute("scArray");
              	if(request.getAttribute("scArray") != null)
            	  {
              		Iterator<ServiceCategory> iterator = scList.iterator();
              		while(iterator.hasNext())
              		{
              			ServiceCategory serviceCategory = iterator.next();
              	
            	  %>
            	   <div class="col">
                     <div class="box_main">
                     <a href="/vendorservices?sid=<%= serviceCategory.getServiceCategoryId()%>&sName=<%= serviceCategory.getServiceCategoryName() %>"><div style="width: 50px;margin: 0 auto; height: 60px;background-size: 100%;background-repeat: no-repeat;text-align: center;display: inline-block;background-image: url(<%= serviceCategory.getServiceCategoryIcon()%>);"></div>
                        <h4 class="fashion_text active"><%= serviceCategory.getServiceCategoryName() %></h4></a>
                     </div>
                  </div>
            	  <%
              		}
            	  }
            	  %>
               </div>
            </div>
         </div>
        
     
      <!-- category section end -->
      
      <!-- new code added -->
          <h1 class="feature_taital">${sName}</h1>                    		
<div class="category_section_2">
            <div class="row">
            <% 
              	ArrayList<VendorServiceProvided> ServiceList = (ArrayList) request.getAttribute("serviceList");
              	if(request.getAttribute("serviceList") != null)
            	  {
              		Iterator<VendorServiceProvided> iterator = ServiceList.iterator();
              		while(iterator.hasNext())
              		{
              			VendorServiceProvided serviceDetails = iterator.next();
              	
            	  %>
            	  <div class="col-lg-2 col-md-5">
            	  <div class="beds_section active">
                     <h1 class="bed_text"><%= serviceDetails.getServiceName() %></h1>
                    <div><img src="<%= serviceDetails.getServiceImage() %>" class="image_2"></div>
                       <div class="text">PRICE: <%= serviceDetails.getServicePrice() %></div>  
                       <div class="text">ADDRESS: <%= serviceDetails.getServiceAddress() %></div>
                       <div class="text">CONTACTNO: <%= serviceDetails.getServiceContactNo() %></div>
                       <div class="text">STATUS: <%= serviceDetails.getServiceStatus() %></div>
                       <div class="text">DESCRIPTION: <%= serviceDetails.getServiceDescription() %></div>
                       
                       
                        <a href="/editservices?sid=<%= serviceDetails.getServiceId() %>">Edit Service</a>
                         <div> <a href="/deleteservices?sid=<%= serviceDetails.getServiceId() %>&sName=${cName}&scid=${sid}">Delete</a></div>
                        </div>
             	</div>
               <%
              		}
            	  }
            	  %>
              		
               </div>
            </div>
        
            </div>
         </div>
         
         
                       
                       
                                     
                       
              
         
         
      <!-- beauty product section end -->
      
       <!-- footer section start -->
      <%@ include file="customerfooter.jsp" %>
      <!-- footer section end -->
    
    <!-- Javascript files-->
      <script src="js/jquery.min.js"></script>
      <script src="js/popper.min.js"></script>
      <script src="js/bootstrap.bundle.min.js"></script>
      <script src="js/jquery-3.0.0.min.js"></script>
      <script src="js/plugin.js"></script>
      <!-- sidebar -->
      <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
      <script src="js/custom.js"></script>
      <!-- javascript --> 
      <script src="js/owl.carousel.js"></script>
      <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script> 
      <script type="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2//2.0.0-beta.2.4/owl.carousel.min.js"></script>
      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
      <script src="../../assets/js/vendor/popper.min.js"></script>
      <script src="../../dist/js/bootstrap.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
   </body>
</html>