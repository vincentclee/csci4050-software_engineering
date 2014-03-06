<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Reserve a Vehicle</title>
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



<h2>Vehicles available at: ${location_name}</h2>

<form action="reserve" method="post">
<table border="1">
<tr>
	<th>ID</th>
	<th>Vehicle</th>
	<th>Type</th>
	<th>Year</th>
	<th>Color</th>
	<th>Hourly Rate</th>
	<th>Daily Rate</th>
	<th>Option</th>
</tr>

<c:forEach items="${vehicles}" var="vehicle" varStatus="i" begin="0">
<tr>
	<td>${i.count}</td>
	<td>${vehicle.make} ${vehicle.model}</td>
	<td>${vehicle.type}</td>
	<td>${vehicle.year}</td>
	<td>${vehicle.color}</td>
	<td><fmt:formatNumber value="${vehicle.hour_rate}" type="currency"/>/hour</td>
	<td><fmt:formatNumber value="${vehicle.day_rate}" type="currency"/>/day</td>
	<td>
	<form action="reserve" method="post">
	<input type="hidden" name="page" value="1">
	<input type="hidden" name="vehicle_id" value="${vehicle.id}">
	<input type="hidden" name="location" value="${location_name}">
	<input type="submit" value="Select"/>
	</form>
	</td>
</tr>
</c:forEach>

</table>
</form>


</body>
</html>
