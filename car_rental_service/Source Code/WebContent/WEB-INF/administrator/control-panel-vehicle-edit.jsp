<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive Vehicle Control Panel</title>
	<script src="assets/application.js" type="text/javascript"></script>
</head>
<body onload="va('${vehicle.type_id}'); vb('${vehicle.location_id}');">

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

<h2>Edit Vehicle</h2>
<form action="administrator" method="post"  name="frm">
Make<input type="text" name="make" value="${vehicle.make}" disabled><br>
Model<input type="text" name="model" value="${vehicle.model}" disabled><br>
Type
<select name="type">
<c:forEach items="${vehicle_types}" var="type" begin="0">
<option value="${type.key}">${type.value}</option>
</c:forEach>
</select><br>

Location
<select name="location">
<c:forEach items="${vehicle_locations}" var="location" begin="0">
<option value="${location.key}">${location.value}</option>
</c:forEach>
</select><br>



TAG<input type="text" name="tag" value="${vehicle.registration}" required><br>
Year<input type="text" name="year" value="${vehicle.year}" required><br>
Color<input type="text" name="color" value="${vehicle.color}" required><br>
Mileage<input type="text" name="mileage" value="${vehicle.mileage}" required><br>
Condition<select name="condition">
<option>Excellent</option>
<option>Good</option>
<option>Fair</option>
<option>Poor</option>
</select><br>
<input type="hidden" name="vehicle_id" value="${vehicle.id}">
<input type="hidden" name="page" value="27">
<input type="submit" value="Save changes"/>
</form>
<form action="administrator" method="post">
<input type="hidden" name="page" value="1">
<input type="submit" value="Cancel"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

<br><br>
<form action="administrator" method="post">
<input type="hidden" name="vehicle_id" value="${vehicle.id}">
<input type="hidden" name="page" value="28">
<input type="submit" value="Remove Vehicle"/>
</form>


</body>
</html>
