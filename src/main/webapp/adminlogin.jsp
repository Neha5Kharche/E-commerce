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
                        <a class="nav-link" href="/index">Home</a>
                     </li>
                      <li class="nav-item">
                        <a class="nav-link" href="/adminlogin">Admin</a>
                     </li>
                     <li class="nav-item">
                       <a class="nav-link" href="/vendorlogin">Vendor</a>

                     </li>
                     
                     <li class="nav-item">
                        <a class="nav-link" href="/customerlogin">Customer</a>
                     </li>
                  </ul>
               </div>
            </nav>
         
        
      </div>
      <!--header section end -->


      <!-- contact section start -->
    
      <div class="contact_section layout_padding">
         <div class="container">
            <h1 class="touch_taital">Admin Login</h1>
            <div class="contact_section_2">
               <div class="row">
                  <div class="col-md-6">
                     <div class="email_text">
                     <form action="/loginCheck" method="post">
                     <h3 class="text-center" style="color: green">${smsg }</h3>
                     <h3 class="text-center" style="color: red">${emsg }</h3>
                        <div class="form-group">
                           <input type="text" class="email-bt" placeholder="User Name" name="userid">
                        </div>
                        <div class="form-group">
                           <input type="password" class="email-bt" placeholder="Password" name="password">
                        </div>
                        <div class="form-check d-flex justify-content-start mb-4">
              <input class="form-check-input" type="checkbox" value="" id="adminlogin" />
              <label class="form-check-label" for="adminlogin"> Remember password </label>
              
            
        
            </div>
            
            
                       
                    <div class="send_btn"><button type="submit" class="btn btn-danger btn-lg">Login</button></div> <div class="send_btn"><button type="reset" class="btn btn-danger btn-lg">Clear</button></div>
                        
                     </form>
                     </div>
                     
                  </div>
                  <div class="col-md-6">
                     <img alt="Login image" src="https://viragtea.com/backend/img/admin-login.jpg" width="500" height="300" style="border:0; width: 100%;">
                  </div>
                  
               </div>
            </div>
         </div>
      </div>
      
      
     
      
    
      
      <!-- contact section end -->
    <!-- footer section start -->
      <div class="footer_section layout_padding">
         <div class="container">
            <div class="row">
               <div class="col-lg-6 col-sm-12">
                  <h4 class="information_text">SHOP NOW!!!</h4>
                  <p class="dummy_text">Looking for an easy and convenient way to shop? Look no further than our ecommerce website! With a vast selection of products at competitive prices, fast shipping, and exceptional customer service, we make online shopping a breeze. Start shopping now and discover why we're the best choice for all your needs. </p>
               </div>
               <div class="col-lg-3 col-sm-6">
                  <div class="information_main">
                     <h4 class="information_text">Useful Links</h4>
                     <p><a style="color:blue;" href="/feedback">FEEDBACK</a><br><a style="color:blue;" href="/fq">FAQ's</a></p>                
                     
                     
                 
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
               Copyright 2020 All Right Reserved
               </h1> 
            </div>
         </div>
      </div>
      <!-- footer section end -->
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
   </body>
</html>