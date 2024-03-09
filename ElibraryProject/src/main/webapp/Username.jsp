<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-BOOK LIBRARY</title>
</head>
<body>
<center>
<h2>
<form method="post" action="Login">
<div class="container">
<h1>WELCOME TO LOGGED IN PAGE</h1><br>
<label for="username"><b>Username: </b></label>
    <input type="text" placeholder="Enter Username" name="username" id="username" required>
    <br><br>
    <label for="psw"><b>Password: </b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
<br><br><p><b>By Logging In... you agree to our Terms & Privacy.</b></p>
    <p><b>Please Contact System Administrator For T&C</b></p><br>
    <button type="submit"  style="width: 50%;" class="registerbtn"><b>Log In<b></button>
  </div>
</form>
</h2>
</center>
</body>
</html>