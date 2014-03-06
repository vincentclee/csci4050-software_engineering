<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive Vehicle Control Panel</title>
</head>
<body>

<table border="1" align="right">
<tr>
	<td>Hi, ${metadata.username}!</td>
	<td><form action="administrator" method="post"><input type="hidden" name="page" value="0"><input type="submit" value="admin pages"/></form></td>
  	<td><form action="logout" method="post"><input type="submit" value="Log Out"/></form></td>
</tr>
</table>

<br><br>
<h1>YouDrive LOGO</h1>

<div style="height:40px;background-color:green">
<table border="1" align="right">
<tr>
  <td><form action="administrator" method="post"><input type="hidden" name="page" value="1"><input type="submit" value="Vehicles"/></form></td>
  <td><form action="administrator" method="post"><input type="hidden" name="page" value="7"><input type="submit" value="Vehicle Types"/></form></td>
  <td><form action="administrator" method="post"><input type="hidden" name="page" value="2"><input type="submit" value="Locations"/></form></td>
  <td><form action="administrator" method="post"><input type="hidden" name="page" value="3"><input type="submit" value="Users"/></form></td>
  <td><form action="administrator" method="post"><input type="hidden" name="page" value="4"><input type="submit" value="Pricing"/></form></td>
</tr>
</table>
</div>

<h2>Add Vehicle</h2>
<form action="administrator" method="post">
<select name="make" onchange="this.form.submit()">
<c:forEach items="${makes}" var="make" begin="0">
<option>${make}</option>
</c:forEach>
</select>
<input type="hidden" name="page" value="9">
</form>

<br><br>
<h2>Vehicles</h2>

<table border="1">
<tr>
<th>ID</th>
<th>Make</th>
<th>Model</th>
<th>Type</th>
<th>Location</th>
<th>TAG</th>
<th>Year</th>
<th>Color</th>
<th>Service</th>
<th>Mileage</th>
<th>Condition</th>
<th>Option</th>
</tr>

<c:forEach items="${vehicles}" var="vehicle" varStatus="i" begin="0">
	<tr>
	<td>${i.count}</td>
	<td>${vehicle.make}</td>
	<td>${vehicle.model}</td>
	<td>${vehicle.type}</td>
	<td>${vehicle.location}</td>
	<td>${vehicle.registration}</td>
	<td>${vehicle.year}</td>
	<td>${vehicle.color}</td>
	<td>${vehicle.service}</td>
	<td><fmt:formatNumber value="${vehicle.mileage}" type="number"/></td>
	<td>${vehicle.cond}</td>
	<td>
	<form action="administrator" method="post">
	<input type="hidden" name="vehicle_id" value="${vehicle.id}">
	<input type="hidden" name="page" value="26">
	<input type="submit" value="Edit"/>
	</form>
	</td>
	</tr>
</c:forEach>
</table>


</body>
</html>
