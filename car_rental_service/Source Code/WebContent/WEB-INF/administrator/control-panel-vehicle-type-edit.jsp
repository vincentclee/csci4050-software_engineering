<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive Vehicle Type Control Panel</title>
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

<h2>Edit Vehicle Type</h2>
<form action="administrator" method="post">
Name<input type="text" name="name" value="${vehicle_type.name}" required><br>
Hourly Rate $<input type="text" name="hour_rate" value="<fmt:formatNumber type="number" minFractionDigits="2" value="${vehicle_type.hour_rate}"/>" required><br>
Daily Rate $<input type="text" name="day_rate" value="<fmt:formatNumber type="number" minFractionDigits="2" value="${vehicle_type.day_rate}"/>" required><br>
<input type="hidden" name="type_id" value="${vehicle_type.type_id}">
<input type="hidden" name="page" value="12">
<input type="submit" value="Save changes"/>
</form>
<form action="administrator" method="post">
<input type="hidden" name="page" value="7">
<input type="submit" value="Cancel"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

<br><br>
<form action="administrator" method="post">
<input type="hidden" name="type_id" value="${vehicle_type.type_id}">
<input type="hidden" name="vehicles" value="${vehicle_type.vehicles}">
<input type="hidden" name="page" value="13">
<input type="submit" value="Remove Vehicle Type"/>
</form>

</body>
</html>
