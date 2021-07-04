
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
<style>
div {
  background-color:white;
  width: 300px;
  border: 15px solid  #999999;
  padding: 50px;
  margin: 20px;
   border-radius: 25px;
   text-align: center;
}
.button{
 background-color:  #999999;
  border-radius: 25px;
    border: none;
 }
 .abc1{
 border-radius: 25px;
  text-align: center;
  }

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<center>
<body>


	<div align="center">
	<br>
	<br>
		<h1>Edit Product</h1>
		<form:form action="update" method="post" modelAttribute="product">
		<table>
			<form:hidden path="id"/>
			<tr>
				
				<td><form:input path="productname" class="abc1" style="width:300px; height:30px;"/></td>
			</tr>
			<br>
			<tr>
		
				<td><form:input path="price" class="abc1" style="width:300px; height:30px;"/></td>
			</tr>
			<br>
			<tr>
				
			<td align="center"><input type="submit" value="Save" class="button" style="width:300px; height:30px;"></td>
			
			</tr>
		</table>
		</form:form>
		<span>${msg}</span>
	</div>
	
</body>
</center>
</html>
