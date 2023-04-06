<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsive Registration Form | CodingLab </title>
    <link rel="stylesheet" href="regis.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <div class="title">Customer Registration</div>
    <div class="content">
      <form action="/registringcustomer">
        <div class="user-details">
          <div class="input-box">
            <span class="details">First Name</span>
            <input type="text" placeholder="Enter your first name" name='cfirstname' pattern="[A-Za-z]+" minlength="4" maxlength="12" required>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text" placeholder="Enter your last name" name='clastname' pattern="[A-Za-z]+" minlength="4" maxlength="12" required>
          </div>
          <div class="input-box">
            <span class="details">Date of Birth</span>
            <input type="date" placeholder="Enter your DOB" name='cdob' required>
          </div>
          <div class="input-box">
            <span class="details">Gender</span>
             <select name="gender" id="gender">
             <option value="">-Select Gender-</option>
             <option value="Male">Male</option>
             <option value="Female">Female</option>
             <option value="Other">Other</option>
             </select>
         </div>
          <div class="input-box">
            <span class="details">Contact Number</span>
            <input type="text" placeholder="Enter your Contact" name='ccontact' pattern="[0-9]{10}" required>
          </div>
          <div class="input-box">
            <span class="details">Address</span>
            <input type="text" placeholder="Enter your address" name='caddress' pattern="[A-Za-z]+" minlength="5" maxlength="50" required>
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input type="text" placeholder="Enter your city" name='city' pattern="[A-Za-z]+" required>
          </div>
          <div class="input-box">
            <span class="details">State</span>
            <input type="text" placeholder="Enter your state" name='state' pattern="[A-Za-z]+" required>
          </div>
          <div class="input-box">
            <span class="details">ZipCode</span>
            <input type="text" placeholder="Enter your zipcode" name='zipcode' minlength="6" maxlength="10" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" placeholder="Enter your Email" name='email' pattern="[A-Za-z]+" minlength="5" maxlength="50" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" placeholder="Enter your password" name='password' pattern="[A-Za-z]+" minlength="5" maxlength="50" required>
          </div>
        </div>
        
        <div class="button">
          <input type="submit" value="Login">
        </div>
        <div align="center"><a href="customerlogin.jsp">Go Back</a></div>
      </form>
    </div>
  </div>

</body>
</html>