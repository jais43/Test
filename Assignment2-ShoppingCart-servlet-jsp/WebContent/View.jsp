<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PET LIST</title>

</head>
<body bgcolor="#FFF0F5">

Hi, <%= (String)session.getAttribute("username") %>
<br><br>
Your Selected Pet : <%= (String)session.getAttribute("pet") %>
<br><hr><br>
Types of <%= (String)session.getAttribute("pet") %> Available are: 
<br><br>

<table>
<c:forEach items="${slist}" var="current">
        <tr>
          <td><c:out value="${current}" /></td>
          <td><input type="button"  value = "Show Info" onclick='Buttonclick("${current}")'></td>
          <td><input type="button"  value = "Buy" onclick='Buttonclick1("${current}")'></td>
        </tr>
      </c:forEach>

</table>
<script>
function  Buttonclick(s)
{
	d=s;
	 window.location.assign("Detail.jsp?urpet="+d);	
}
function  Buttonclick1(b)
{
j=b;
	 window.location="Buy.jsp?urpet="+j;	
}
</script>
</body>
</html>
 