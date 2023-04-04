<!DOCTYPE html>
<!-- Designined by CodingLab - youtube.com/codinglabyt -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsive Registration Form | CodingLab </title>
    <link rel="stylesheet" href="regis.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Vendor Registration</div>
    <div class="content">
      <form action="/registringvendor">
        <div class="user-details">
          <div class="input-box">
            <span class="details">First Name</span>
            <input type="text" placeholder="Enter your first name" name='vfirstname' required>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text" placeholder="Enter your last name" name='vlastname' required>
          </div>
          <div class="input-box">
            <span class="details">Date of Birth</span>
            <input type="date" placeholder="Enter your DOB" name='vdob' required>
          </div>
          <div class="input-box">
            <span class="details">Gender</span>
            <input type="text" placeholder="Enter your gender" name='vgender' required>
          </div>
          <div class="input-box">
            <span class="details">Contact Number</span>
            <input type="text" placeholder="Enter your Contact" name='vcontact' required>
          </div>
          <div class="input-box">
            <span class="details">Address</span>
            <input type="text" placeholder="Enter your address" name='vaddress' required>
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input type="text" placeholder="Enter your city" name='city' required>
          </div>
          <div class="input-box">
            <span class="details">State</span>
            <input type="text" placeholder="Enter your state" name='state' required>
          </div>
          <div class="input-box">
            <span class="details">ZipCode</span>
            <input type="text" placeholder="Enter your zipcode" name='zipcode' required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" placeholder="Enter your Email" name='email' required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" placeholder="Enter your password" name='password' required>
          </div>
        </div>
        
        <div class="button">
          <input type="submit" value="Login">
        </div>
      </form>
    </div>
  </div>

</body>
</html>
