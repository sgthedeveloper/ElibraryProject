<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
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
<h1>WELCOME TO E-BOOK LIBRARY</h1><br>
<strong>Last Time To Visit Or Referesh This Page is:</strong> <%=new Date() %><br><br>
<p><b>CHOOSE A OPTION:</b></p>
<p><a href="insert.jsp?id=1"><b>INSERT A BOOK RECORD</b></a></p>
<p><a href="search.jsp?id=1"><b>SEARCH A BOOK RECORD</b></a></p>
<p><a href="update.jsp?id=1"><b>UPDATE A BOOK RECORD</b></a></p>
<p><a href="delete.jsp?id=1"><b>DELETE A BOOK RECORD</b></a></p>
<p><a href="display.jsp?id=1"><b>DISPLAY BOOKLISTS</b></a></p>
<br><p><a href="index.jsp?id=1"><b>Log Out And Return To Homepage</b></a></p>
</center>
</body>
</html>