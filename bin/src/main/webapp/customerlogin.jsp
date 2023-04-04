<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login Form Design | CodeLab</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <div class="wrapper">
      <div class="title">Customer Login Form</div>
      <p style="color: red;text-align: center;">${errmsg }</p>
      <form action="/cLogin">
        <div class="field">
          <input type="email" name='email' required>
          <label>Customer Id</label>
       <!DOCTYPE html>
 </div>
        <div class="field">
          <input type="password" name='password' required>
          <label>Password</label>
        </div>
        
          
        <div class="field">
          <input type="submit" value="Login">
        </div>
        
        <div class="signup-link">Need an Account? <a href="customerregis">Customer Registration</a></div>
      </form>
    </div>

  </body>
</html>
