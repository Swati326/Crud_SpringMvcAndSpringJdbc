<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
      <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Online Shop</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
<center>
<div>
<br>
<center><h2>WELCOME TO ADMIN</h2></center>
<br>
<br>
<form name="frm" action="hi" method="POST">
<input type="text" value=""  Placeholder="enter username" name="name" style="width:300px; height:30px;"/>
<br><br>
<input type="text" value=""  Placeholder="enter password" name="password" style="width:300px; height:30px;"/>
<br><br>
<input type="submit" value="Login" name="s" style="width:300px; height:30px;"/>
<br><br>
<span>${msg}</span>
</form>
</div>
</center>
</body>
</html>