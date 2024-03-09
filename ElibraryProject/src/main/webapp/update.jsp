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
<form method="get" action="UpdatingBook">
<div class="container">
<h1>UPDATE A BOOK DETAIL</h1><br>
    <label for="bookid"><b>Enter the Book ID: </b></label>
    <input type="number" style="width: 20%;" placeholder="BOOK ID (IN NUMBER)" name="bookid" id="bookid" required>
    <br><br>
    
    <label for="price"><b>Enter the New Price: </b></label>
    <input type="number" style="width: 20%;" placeholder="BOOK PRICE (IN NUMBER)" name="price" id="price" min="1" max="10000" required>
    <br><br>
    
    <label for="quantity"><b>Enter the New Quantity: </b></label>
    <input type="number" style="width: 20%;" placeholder="BOOK QUANTITY (IN NUMBER)" name="quantity" id="quantity" min="0" max="20000" required>
    <br><br><br>
    
    <button type="submit"  style="width: 50%;" class="registerbtn"><b>Update Book Detail</b></button>
  </div>
</form>
</h2>
</center>
</body>
</html>