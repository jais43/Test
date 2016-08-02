<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="Logout.jsp" %>
   <%@ taglib uri="randome" prefix="c" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="mine" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PET info</title>

</head>
<body bgcolor="#D3D3D3">
<% String paramtr = request.getParameter("urpet");%>


<mine:set var="nam_par" value="<%= paramtr %>"/>
<table>
<tr>
<td><b>Pet Category :</b></td>
<td>${sessionScope.pet}</td>
</tr>
<tr>
<td><b>Breed :</b></td>
<td><%= paramtr %></td>
</tr>
<tr>
<td><b>Colors Available :</b></td>
<mine:forEach var="color_param" items="${c:colors(nam_par)}">
<td>
<mine:out value="${color_param}"/>
&nbsp;
</td>
</mine:forEach>
</tr>
<tr>
<td><b>Price : </b></td>
<td>RS. ${c:price(nam_par)}</td>
</tr>
</table>
</body>
</html>