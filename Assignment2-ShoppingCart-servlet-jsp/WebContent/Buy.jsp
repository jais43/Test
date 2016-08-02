<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="Logout.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#FFF0F5">
Hey,  <%= (String)session.getAttribute("username") %>
<br><br>
<% String paramtr = request.getParameter("urpet");%>
Your Choice <%= paramtr %> is Added to Cart... <br><hr><br>
<marquee><b> Thanks for Buying!!</b></marquee>
&nbsp;
Visit Again.
</html>