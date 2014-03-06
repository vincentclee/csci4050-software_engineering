<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Return Vehicle</title>
</head>
<body>

<table border="1" align="right">
<tr>
	<td>Hi, ${metadata.username}!</td>
  	<td><form action="logout" method="post"><input type="submit" value="Log Out"/></form></td>
</tr>
</table>

<br><br>
<h1>YouDrive LOGO</h1>

<div style="height:40px;background-color:green">
<table border="1" align="right">
<tr>
  <td><form action="reserve" method="post"><input type="submit" value="Reserve a Car"/></form></td>
  <td><form action="customer" method="post"><input type="submit" value="My Stuff"/></form></td>
</tr>

</table>
</div>

<h2>Error</h2>
You have returned this vehicle late.<br>

You have been charged an additional <fmt:formatNumber type="currency" value="${overage}"/> for this rental.




</body>
</html>
