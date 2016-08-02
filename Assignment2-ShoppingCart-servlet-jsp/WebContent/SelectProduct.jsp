<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file="Logout.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="#f4f2c6">
<form action="CreateSession" method= "post">
<h1>Welcome to pet Shop!!!</h1>
Choose from Pet List: 
Please Select the Pet You want to buy:<select name ="category" required= "required">
<option value="">select</option>
<option>Cat</option>
<option>Dog</option>

</select>
<br><br>

<input type ="submit"  value = "submit">

</form>
</body>
</html>