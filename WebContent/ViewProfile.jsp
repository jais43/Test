<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit your profile</h1>


<form action="Logout.jsp" >
Hi, <%= (String)session.getAttribute("username") %>
<h1>Your Profile is:</h1>
<jsp:useBean id="set" class="com.bitwise.filter.Userprofile" scope="session"/>
<%-- Full_name <jsp:getProperty property="fullname" name="set"/><br>
EmailId: <jsp:getProperty property="emailId" name="set"/><br> --%>
10th marks: <jsp:getProperty property="tenthmarks" name="set"/><br>
12th marks <jsp:getProperty property="twlthmarks" name="set"/><br>
University: <jsp:getProperty property="university" name="set"/><br>
City: <jsp:getProperty property="city" name="set"/><br>
state: <jsp:getProperty property="state" name="set"/><br>
country: <jsp:getProperty property="country" name="set"/><br>
Company Name: <jsp:getProperty property="cname" name="set"/><br>
Work as: <jsp:getProperty property="position" name="set"/><br>

<input type = "submit" value = "Logout"/>
</form>
</body>
</html>