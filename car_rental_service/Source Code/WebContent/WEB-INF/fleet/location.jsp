<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>${location.street1} (${location.name}) - YouDrive Rental Location</title>
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
<h2>The ${location.name} - YouDrive Rental Location</h2>

${location.street1} ${location.city}, ${location.state} ${location.zip}<br>
	
<c:if test="${location.name eq 'NYC1'}">
  	<img src="images/NYC1.jpg">
</c:if>
<c:if test="${location.name eq 'NYC2'}">
  	<img src="images/NYC2.jpg">
</c:if>
<c:if test="${location.name eq 'NYC3'}">
  	<img src="images/NYC3.jpg">
</c:if>

<br><br>

<h2>Vehicles</h2>
<table border="1">
<tr>
	<th>Make</th>
	<th>Model</th>
	<th>Type</th>
	<th>Year</th>
	<th>Color</th>
</tr>
<c:forEach items="${vehicles}" var="vehicle" begin="0">
<tr>
	<td>${vehicle.make}</td>
	<td>${vehicle.model}</td>
	<td>${vehicle.type}</td>
	<td>${vehicle.year}</td>
	<td>${vehicle.color}</td>
</tr>
</c:forEach>

</table>
</body>
</html>
