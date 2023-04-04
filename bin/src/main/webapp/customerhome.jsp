<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Transparent Login Form UI</title>
    <link rel="stylesheet" href="home.css">
   <script src="https://kit.fontawesome.com/a076d05399.js"></script>
  </head>
  <body>
    <div class="bg-img">
      <div class="content">
      <header>Customer Home</header>
      
       <div class="field">
          <input type="submit" value="Add Product">
        </div>
        <div class="field">
          <input type="submit" value="Product list">
        </div>
        <div class="field">
          <input type="submit" value="Add Category">
        </div>
        <div class="field">
          <input type="submit" value="Get Category List">
        </div>
        <div class="field">
          <input type="submit" value="Add Service">
        </div>
        <div class="field">
          <input type="submit" value="Service List">
        </div>
        <div class="field">
          <input type="submit" value="Add service category">
        </div>
        <div class="field">
          <input type="submit" value="Get Category List">
        </div>
      </div>
    </div>

    <script>
      const pass_field = document.querySelector('.pass-key');
      const showBtn = document.querySelector('.show');
      showBtn.addEventListener('click', function(){
       if(pass_field.type === "password"){
         pass_field.type = "text";
         showBtn.textContent = "HIDE";
         showBtn.style.color = "#3498db";
       }else{
         pass_field.type = "password";
         showBtn.textContent = "SHOW";
         showBtn.style.color = "#222";
       }
      });
    </script>


  </body>
</html>