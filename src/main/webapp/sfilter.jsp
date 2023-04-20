<%@page import="com.example.demo.model.VendorServiceProvided"%>
<%@page import="com.example.demo.model.ServiceCategory"%>
<%@page import="com.example.demo.model.ProductCategory"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.example.demo.model.Product"%>
<%@page import="java.util.ArrayList"%>
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
        
      </style>
      <style>
@import url('https://fonts.googleapis.com/css2?family=Poppins&display=swap');
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
}
.wrapper{
    padding: 30px;
    max-width: 1200px;
    margin: auto;
}
.h3{
    font-weight: 900;
}
.views{
    font-size: 0.85rem;
}
.btn{
    color: #666;
    font-size: 0.85rem;
}
.btn:hover{
    color: #61b15a;
}
.green-label{
    background-color: #defadb;
    color: #48b83e;
    border-radius: 5px;
    font-size: 0.8rem;
    margin: 0 3px;
}
.radio,.checkbox{
    padding: 6px 10px;
}
.border{
    border-radius: 12px;
}
.options{
    position: relative;
    padding-left: 25px;
}
.radio label,
.checkbox label{
    display: block;
    font-size: 14px;
    cursor: pointer;
    margin: 0;
}
.options input{
    opacity: 0;
}
.checkmark {
    position: absolute;
    top: 0px;
    left: 0;
    height: 20px;
    width: 20px;
    background-color: #f8f8f8;
    border: 1px solid #ddd;
    border-radius: 50%;
}
.options input:checked ~ .checkmark:after {
    display: block;
}
.options .checkmark:after{
    content: "";
	width: 9px;
    height: 9px;
    display: block;
	background: white;
    position: absolute;
    top: 52%;
	left: 51%;
    border-radius: 50%;
    transform: translate(-50%,-50%) scale(0);
    transition: 300ms ease-in-out 0s;
}
.options input[type="radio"]:checked ~ .checkmark{
    background: #61b15a;
    transition: 300ms ease-in-out 0s;
}
.options input[type="radio"]:checked ~ .checkmark:after{
    transform: translate(-50%,-50%) scale(1);
}
.count{
    font-size: 0.8rem;
}
label{
    cursor: pointer;
}
.tick{
    display: block;
    position: relative;
    padding-left: 23px;
    cursor: pointer;
    font-size: 0.8rem;
    margin: 0;
}
.tick input{
    position: absolute;
    opacity: 0;
    cursor: pointer;
    height: 0;
    width: 0;
}
.check{
    position: absolute;
    top: 1px;
    left: 0;
    height: 18px;
    width: 18px;
    background-color: #f8f8f8;
    border: 1px solid #ddd;
    border-radius: 3px;
}
.tick:hover input ~ .check {
    background-color: #f3f3f3;
}
.tick input:checked ~ .check {
    background-color: #61b15a;
}
.check:after {
    content: "";
    position: absolute;
    display: none;
}
.tick input:checked ~ .check:after {
    display: block;
    transform: rotate(45deg) scale(1);
} 
.tick .check:after {
    left: 6px;
    top: 2px;
    width: 5px;
    height: 10px;
    border: solid white;
    border-width: 0 3px 3px 0;
    transform: rotate(45deg) scale(2);
}
#country{
    font-size: 0.8rem;
    border: none;
    border-left: 1px solid #ccc;
    padding: 0px 10px;
    outline: none;
    font-weight: 900;
}
.close{
    font-size: 1.2rem;
}
div.text-muted{
    font-size: 0.85rem;
}
#sidebar{
    width: 25%;
    float: left;
}
.category{
    font-size: 0.9rem;
    cursor: pointer;
}
.list-group-item{
    border: none;
    padding: 0.3rem 0.4rem 0.3rem 0rem;
}
.badge-primary{
    background-color: #defadb;
    color: #48b83e
}
.brand .check{
    background-color: #fff;
    top: 3px;
    border: 1px solid #666;
}
.brand .tick{
    font-size: 1rem;
    padding-left: 25px;
}
.rating .check{
    background-color: #fff;
    border: 1px solid #666;
    top: 0;
}
.rating .tick{
    font-size: 0.9rem;
    padding-left: 25px;
}
.rating .fas.fa-star{
    color: #ffbb00;
    padding: 0px 3px;
}
.brand .tick:hover input ~ .check,
.rating .tick:hover input ~ .check{
    background-color: #f9f9f9;
}
.brand .tick input:checked ~ .check,
.rating .tick input:checked ~ .check{
    background-color: #61b15a;
}
#products{
    width: 75%;
    padding-left: 30px;
    margin: 0;
    float: right;
}
.card:hover{
    transform: scale(1.1);
    transition: all 0.5s ease-in-out;
    cursor: pointer;
}
.card-body{
    padding: 0.5rem;
}
.card-body .description{
    font-size: 0.78rem;
    padding-bottom: 8px;
}
div.h6,h6{
    margin: 0;
}
.product .fa-star{
    font-size: 0.9rem;
}
.rebate{
    font-size: 0.9rem   ;
}
.btn.btn-primary{
    background-color: #48b83e;
    color: #fff;
    border: 1px solid #008000;    
    border-radius: 10px;
    font-weight: 800;
}
.btn.btn-primary:hover{
    background-color: #48b83ee8;
}
img{
    width: 192px;
    height: 132px;
    object-fit: contain;
}

.clear{
    clear: both;
}
.btn.btn-success{
    visibility: hidden;
}
@media(min-width:992px){
    .filter,#mobile-filter{
        display: none;
    }
}
@media(min-width:768px) and (max-width:991px){
    .radio, .checkbox {
        padding: 6px 10px;
        width: 49%;
        float: left;
        margin: 5px 5px 5px 0px;
    }
    .filter,#mobile-filter{
        display: none;
    }
}
@media(min-width:576px) and (max-width:767px){
    #sidebar{
        width: 35%;
    }
    #products{
        width: 65%;
    }
    .filter,#mobile-filter{
        display: none;
    }
    .h3 + .ml-auto{
        margin: 0;
    }
}
@media(max-width:575px){
    .wrapper{
        padding: 10px;
    }
    .h3{
        font-size: 1.3rem;
    }
    #sidebar{
        display: none;
    }
    #products{
        width: 100%;
        float: none;
    }
    #products{
        padding: 0;
    }
    .clear{
        float: left;
        width: 80%;
    }
    .btn.btn-success{
        visibility: visible;
        margin: 10px 0px;
        color: #fff;
        padding: 0.2rem 0.1rem;
        width: 20%;
    } 
    .green-label{
        width: 50%;
    }
    .btn.text-success{
        padding: 0;
    }
    .content,#mobile-filter{
        clear: both;
    }
}
</style>

<script type="text/javascript">

function productList() {
	
	return true;
	
}

</script>
   </head>
   <body>
      <!--header section start -->
      <div class="header_section">
         <div class="container">
            <nav class="navbar navbar-dark bg-dark">
               <a class="logo" href="index.html"><img src="images/logo.png"></a>
               <div class="search_section">
                  <ul>
                    
                     <li><a href="/cart"><img src="images/shopping-bag.png"></a></li>
                     <li><a href="/chome"><img src="images/home.png" width="19px" height="19px" ></a></li>
                     <li><a href="/help"><img src="images/help.png"></a></li>
                  </ul>
               </div>
               <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample01" aria-controls="navbarsExample01" aria-expanded="false" aria-label="Toggle navigation">
               <span class="navbar-toggler-icon"></span>
               </button>
               
               <div class="collapse navbar-collapse" id="navbarsExample01">
                  <ul class="navbar-nav mr-auto">
                     <li class="nav-item active">
                        <a class="nav-link" href="/chome">Home</a>
                     </li>
                      <li class="nav-item">
                        <a class="nav-link" href="/customerViewAllProducts">Products</a>
                     </li>
                     <li class="nav-item">
                       <a class="nav-link" href="/customerViewAllServices">Services</a>

                     </li>
                     
                     <li class="nav-item">
                        <a class="nav-link" href="/clogout">Logout</a>
                     </li>
                  </ul>
               </div>
            </nav>
         </div>
        
      </div>
      <!--header section end -->
      <div class="wrapper">
    <div class="d-md-flex align-items-md-center">
        <div class="h3">Filter</div>
        <div class="ml-auto d-flex align-items-center views"> <span class="btn text-success"> <span class="fas fa-th px-md-2 px-1"></span><span>Grid view</span> </span> <span class="btn"> <span class="fas fa-list-ul"></span><span class="px-md-2 px-1">List view</span> </span> <span class="green-label px-md-2 px-1">428</span> <span class="text-muted">Products</span> </div>
    </div>
    
    <div class="filters"> <button class="btn btn-success" type="button" data-toggle="collapse" data-target="#mobile-filter" aria-expanded="true" aria-controls="mobile-filter">Filter<span class="px-1 fas fa-filter"></span></button> </div>
    
    <div class="content py-md-0 py-3">
        <section id="sidebar">
            <div class="py-3">
                <h5 class="font-weight-bold">Filter By</h5>
                <form action="applySFilter" class="brand">
                <% 
              	ArrayList<ServiceCategory> serviceCategoryList = (ArrayList) request.getAttribute("scArray");
              	if(request.getAttribute("scArray") != null)
            	  {
              		Iterator<ServiceCategory> serviceCategoryIterator = serviceCategoryList.iterator();
              		while(serviceCategoryIterator.hasNext())
              		{
              			ServiceCategory categoryDetails = serviceCategoryIterator.next();
              			long scid = (long)categoryDetails.getServiceCategoryId();
              			
            	  %>
                
                <h5 class="font-weight-bold"><%= categoryDetails.getServiceCategoryName() %></h5>
                
                <% 
              	ArrayList<VendorServiceProvided> ServiceList = (ArrayList) request.getAttribute("serviceList");
              	if(request.getAttribute("serviceList") != null)
            	  {
              		Iterator<VendorServiceProvided> serviceiterator = ServiceList.iterator();
              		while(serviceiterator.hasNext())
              		{
              			VendorServiceProvided serviceDetails = serviceiterator.next();
              			long sid = Long.parseLong(serviceDetails.getServiceCategory());
              			if(sid == scid)
              			{
              	
            	  %>
            	  <div class="form-inline d-flex align-items-center py-1"> <label class="tick"><%= serviceDetails.getServiceName() %><input type="checkbox" name="servicename" value="<%= serviceDetails.getServiceName() %>"> <span class="check"></span> </label> </div><div></div>
               <% } } } } }%>
               <input type="submit" value="Apply">
            </form>
            
            </div>
            
            
        </section> <!-- Products Section -->
        
                          
                    
                 
    </div>
</div>
          
         
         
         
      <!-- beauty product section end -->
      
      
      <!-- newsletter section start -->
      <div class="newsletter_section layout_padding">
         <div class="container">
            <h6 class="conect_text">Connect to caraft</h6>
            <h1 class="newsletter_taital">Join Our Newsletter</h1>
            <p class="newsletter_text">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration </p>
            <div class="input-group mb-3">
               <input type="text" class="form-control" placeholder="Enter your email" aria-label="Enter your email" aria-describedby="basic-addon2">
               <div class="input-group-append">
                  <span class="input-group-text" id="basic-addon2">Subscribe</span>
               </div>
            </div>
         </div>
      </div>
      <!-- newsletter section end -->
      <!-- footer section start -->
      <div class="footer_section layout_padding">
         <div class="container">
            <div class="row">
               <div class="col-lg-6 col-sm-12">
                  <h4 class="information_text">Category</h4>
                  <p class="dummy_text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim </p>
               </div>
               <div class="col-lg-3 col-sm-6">
                  <div class="information_main">
                     <h4 class="information_text">Useful Links</h4>
                     <p class="many_text">Contrary to popular belief, Lorem Ipsum is not simply random text. It </p>
                  </div>
               </div>
               <div class="col-lg-3 col-sm-6">
                  <div class="information_main">
                     <h4 class="information_text">Contact Us</h4>
                     <p class="call_text"><a href="#">+01 1234567890</a></p>
                     <p class="call_text"><a href="#">+01 9876543210</a></p>
                     <p class="call_text"><a href="#">demo@gmail.com</a></p>
                     <div class="social_icon">
                        <ul>
                           <li><a href="#"><img src="images/fb-icon.png"></a></li>
                           <li><a href="#"><img src="images/twitter-icon.png"></a></li>
                           <li><a href="#"><img src="images/linkedin-icon.png"></a></li>
                           <li><a href="#"><img src="images/instagram-icon.png"></a></li>
                        </ul>
                     </div>
                  </div>
               </div>
            </div>
            <div class="copyright_section">
               <h1 class="copyright_text">
               Copyright 2020 All Right Reserved <a href="https://html.design"> Free Html Templates</a>
            </div>
         </div>
      </div>
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