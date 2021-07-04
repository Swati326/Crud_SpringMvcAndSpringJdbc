
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Product App</title>
</head>
<body>
	<br>
	<br>
	<form name='frm' action='update' method='POST'>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"></script>

		<div class="row mb-2">
			<label for="productname" class="col-sm-2 col-form-label">Product
				Name</label>
			<div class="col-sm-10">
				<input type="${product.productname}" name="productname" class="form-control">
			</div>
		</div>
		<div class="row mb-2">
			<label for="price" class="col-sm-2 col-form-label">Product
				Price</label>
			<div class="col-sm-10">
				<input type="${product.price}" name="price" class="form-control">
			</div>
		</div>
		<button type="submit" class="btn btn-success text-center">Add
			New Product</button>
		${msg}
	</form>
</body>
</html>