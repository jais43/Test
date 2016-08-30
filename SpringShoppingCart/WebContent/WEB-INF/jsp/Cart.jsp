<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart</title>

</head>
<body>
<h1>Your Cart contains following list of items</h1>

<td> <a href='<c:url value='/logout'/>'><button type="button" style="float: right;" >Logout</button></a>

<form action="remove" Method = "POST">

<c:forEach items="${ProductList}" var="current">
        
         <input type="checkbox" name="cpd" value="${current}"> <b> <c:out value="${current}" /></b><br>
       
      </c:forEach>
      <input type ="submit"  value = "delete">
       
        
</table>
</form>

      
 <center>
   		<tr>
      <td><a href="buy"><button type="button">Place order</button></a></td>
        <a href='<c:url value='/main'/>'><button type="button">Shop More</button></a></td>
        
 </tr> 	
 </center>
        
</body>
</html>