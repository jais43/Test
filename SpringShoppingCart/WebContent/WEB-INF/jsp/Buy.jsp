<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pay Price</title>
<h1>Thanks for Shopping</h1>
Your ordr is placed.......


<p>Total Amount You need to pay is:
<b>${Total}</b>
<br><p>
 <td> <a href='<c:url value='/logout'/>'><button type="button">Logout</button></a></td>
   <a href='<c:url value='/main'/>'><button type="button">Shop More</button></a></td>
</head>
<body>

</body>
</html>