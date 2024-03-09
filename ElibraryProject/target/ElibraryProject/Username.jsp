<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Username</title>
</head>
<body>
<h2>
<form method="post" action="Login">
<label>Username: <input type="text" id="username"></label>
<label>Password: <input type="password" id="pwd"></label>
<input type="submit" class="login" value="Log In" onclick="validation()" formtarget="_blank">
</form>
</h2>
</body>
</html>