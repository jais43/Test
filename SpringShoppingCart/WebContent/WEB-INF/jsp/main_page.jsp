<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%--  <%@ page isELIgnored="false" %> --%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pet Shop</title>
</head>
<body>
Welcome to PetShop!!!
<br/>


<form action="/SpringShoppingCart/product" method= "Post">
<h1>Welcome to pet Shop!!!</h1>
Choose from Pet List: 
Please Select the Pet You want to buy:<select name ="category" required= "required">
<option value="">select</option>
<option>Cat</option>
<option>Dog</option>

</select>
<br><br>
<tr>
<td><input type ="submit"  value = "submit"></td>
<td> <a href='<c:url value='/logout'/>'><button type="button">Logout</button></a></td>
 
</tr>
</form>


 
</body>

</html>