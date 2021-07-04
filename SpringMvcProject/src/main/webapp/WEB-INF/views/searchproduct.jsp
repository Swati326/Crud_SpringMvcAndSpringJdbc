<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<%@include file="view.jsp" %>
<br>
<br>
<form name="frm" action="search" method="GET">
<center><input type="text" name="productname" value="" Placeholder="Enter Product Name To Search" style="width:500px; height:40px;"/></center>
<br>
<br>
<center><input type="submit" name="s" value="click to search"  style="width:200px; height:30px;" /></center>
</form>
<br>
<br>
<br>
<br>
<center><a href="back">Go To Home</a></center>
</body>
</html>