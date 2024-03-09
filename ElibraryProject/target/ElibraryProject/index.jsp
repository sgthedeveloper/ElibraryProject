<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-BOOK LIBRARY</title>
</head>
<body>
<center>
<h1>User Registration Form</h1>
<form method="post" action="registrationClass">
  <div class="container">
    <h1>Register</h1>
    <h3>Please fill in this form to create an E-LIBRARY account.</h3>
    <hr>

    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" id="username" required>
    <br><br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
    <hr>

    <p><b>By creating an account you agree to our Terms & Privacy.</b></p>
    <p><b>Please Contact System Administrator For T&C</b></p>
    <button type="submit"  style="width: 50%;" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="Username.jsp?id=1"><b>Sign in</b></a>.</p>
  </div>
</form>
</center>
</body>
</html>