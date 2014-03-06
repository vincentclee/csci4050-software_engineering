<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Rates and Plans</title>
</head>
<body>

<table border="1" align="right">
<tr>
	<td><form action="login" method="post"><input type="submit" value="Log In"/></form></td>
</tr>
</table>

<br><br>
<h1>YouDrive LOGO</h1>

<div style="height:40px;background-color:green">
<table border="1" align="right">
<tr>
  <td><form action="register" method="post"><input type="submit" value="Join"/></form></td>
  <td><form action="fleet" method="post"><input type="submit" value="Our Fleet"/></form></td>
  <td><form action="pricing" method="post"><input type="submit" value="Rates & Plans"/></form></td>
</tr>
</table>
</div>
<h2>Membership Plans</h2>
<table border="1">
<tr>
<c:forEach items="${memberships}" var="item" begin="0">
	<td>${item.name}</td>
</c:forEach>
</tr>
<tr>
<c:forEach items="${memberships}" var="item" begin="0">
	<td>${item.description}</td>
</c:forEach>
</tr>
<tr>
<c:forEach items="${memberships}" var="item" begin="0">
	<td><fmt:formatNumber value="${item.price}" type="currency"/></td>
</c:forEach>
</tr>
<tr>
<c:forEach items="${memberships}" var="item" begin="0">
	<td>${item.months} months</td>
</c:forEach>
</tr>
</table>
<br><br>
<h2>Vehicle Rates</h2>

<table border="1">
<tr>
	<th>Name</th>
	<th>Hourly</th>
	<th>Daily</th>
</tr>

<c:forEach items="${vehicletypes}" var="vehicletype" begin="0">
<tr>
	<td>${vehicletype.name}</td>
	<td><fmt:formatNumber value="${vehicletype.hour_rate}" type="currency"/>/hour</td>
	<td><fmt:formatNumber value="${vehicletype.day_rate}" type="currency"/>/day</td>
</tr>
</c:forEach>

</table>
<br><br>





</body>
</html>
