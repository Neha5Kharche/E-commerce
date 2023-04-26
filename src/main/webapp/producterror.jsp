<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="wrapper style3">
       <script>
           swal("${product.getProductName()} Already Exist!", "", "error").then(function() {window.location = "/viewproducts";}); 
           
            </script>
    </body>
</html>