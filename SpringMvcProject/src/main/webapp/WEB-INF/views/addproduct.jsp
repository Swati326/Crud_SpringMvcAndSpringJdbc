
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<title>Product App</title>
</head>
<body>
	<%@include file="view.jsp"%>
	<center>
	<br>
		<h1>Add New Product</h1>
	</center>
	<br>
	<br>
	<form name='frm' action='add' method='POST'>
		
		<center>
			<input type="productname" name="productname"
				Placeholder="Enter product name" style="width: 400px; height: 30px;"/>
		</center>
		<br> 
		<center>
			<input type="price" name="price" Placeholder="Enter product price"
				style="width: 400px; height: 30px;" />
		</center>
		<br>
		<center>
			<button type="submit" style="width: 400px; height: 30px;">Save Product</button>
		</center>
		${msg}
	</form>
	<br>
<br>
<center><a href="back">Go To Home</a></center>
</body>
</html>