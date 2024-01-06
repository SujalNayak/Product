<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product JSP</h1>
	<br><br><br>
	<form action="saveproduct" method="post">
		<label for="name">Product Name: </label>
		<input type="text" name="name"><br><br>
		
		<label for="price">Product Price: </label>
		<input type="number" name="price"><br><br>
		
		<label for="qty">Product Quantity: </label>
		<input type="number" name="qty"><br><br>
		
		<label for="cty">Product Category: </label>
		<input type="text" name="cty"><br><br>
		
		<input type="submit" value="Save Product" >
	</form>
</body>
</html>