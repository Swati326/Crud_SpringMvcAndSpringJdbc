<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   <style>
table, td, th {
  border: 1px solid black;
   padding-bottom:20px;
}
tr{
 background-color:white;
  padding-bottom:20px;
}
table {
  border-collapse: collapse;
  width: 100%;
  background-color:red;
  padding-bottom:20px;
}

th {
  height: 30px;
  color:white;
   background-color:black;
    padding-bottom:20px;
}
}
</style>
  </head>
   <body>
   <%@include file="view.jsp" %>
   <br>
   <br>
<table border="2">
<tr><th>Product Name</th><th>Price</th><th>Edit</th><th>Delete</th></tr>
<tr>
<td><center>${product.productname}</center></td>
<td><center>${product.price}</center></td>
<td><center><a href="editproduct?id=${product.id}">Edit</a><center></td>
<td><center><a href="deleteproduct?id=${product.id}">Delete</a><center></td>
</tr>
</table>
<br>
<br>
<center><a href="back">Go To Home</a></center>
  </body>
</html>