<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LogIn</h1>

<form method = "post" action="Login" >
<input type = "text" name = "uname" placeholder="enter your username" required="required"/>
<input type = "password" name = "passsword" placeholder="enter your password" required="required"/>
<input type = "submit" value = "Login"/>
</form>
</body>
</html>