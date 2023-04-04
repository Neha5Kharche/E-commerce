<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login Form Design | CodeLab</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <div class="wrapper">
      <div class="title">Admin Login</div>
      <p style="color: red;text-align: center;">${errmsg }</p>
      <form action="/cLogin">
        <div class="field">
          <input type="email" name='email' required>
          <label>Admin Id</label>
       <!DOCTYPE html>
 </div>
        <div class="field">
          <input type="password" name='password' required>
          <label>Password</label>
        </div>
        
          
        <div class="field">
          <input type="submit" value="Login">
        </div>
        
        
      </form>
    </div>

  </body>
</html>
