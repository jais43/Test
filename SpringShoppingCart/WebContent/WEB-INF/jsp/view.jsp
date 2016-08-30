<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
</head>
<body>
<h1>your selected product is : <b>${pet}</b></h1>
<b>Detail of Your Selected Product</b>

<c:if test='${pet == "Cat"}'>
<p><b>Color:</b>white</p><br>
<p><b>Price:</b>100.00</p>
</c:if>

<c:if test='${pet == "Dog"}'>
<p><b>Color:</b>Black</p><br>
<p><b>Price:</b>200.00</p>
</c:if>



<br>
<form action="/SpringShoppingCart/Add" Method = "POST">


<input type ="submit"  value = "ADD to Cart">

</form>
</body>
</html>