<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive Vehicle Control Panel</title>
	<script src="assets/application.js" type="text/javascript"></script>
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
Make
<select name="make">
<option>${make}</option>
</select><br>

Model
<select name="model">
<c:forEach items="${models}" var="model" begin="0">
<option>${model}</option>
</c:forEach>
</select><br>

Vehicle Type
<select name="type">
<c:forEach items="${types}" var="type" begin="0">
<option>${type.name}</option>
</c:forEach>
</select><br>

Location
<select name="location">
<c:forEach items="${locations}" var="location" begin="0">
<option>${location.name}</option>
</c:forEach>
</select><br>

TAG<input type="text" name="tag" value="" required><br>
Year
<select name="year1">
    <c:forEach var="i" begin="0" end="114">
    	<option>${2014-i}</option>
	</c:forEach>
</select><br>

Color<input type="text" name="color" value="" required><br>
Last Service Date
<table border="1">
<tr>
	<td><select name="month">
<option value="1">January</option>
        <option value="2">February</option>
        <option value="3">March</option>
        <option value="4">April</option>
        <option value="5">May</option>
        <option value="6">June</option>
        <option value="7">July</option>
        <option value="8">August</option>
        <option value="9">September</option>
        <option value="10">October</option>
        <option value="11">November</option>
        <option value="12">December</option>
		</select>
	</td>
	<td><select name="day">
	<c:forEach var="i" begin="1" end="31">
   		<option>${i}</option>
   	</c:forEach>
		</select>
	</td>
    <td><select name="year">
         <c:forEach var="i" begin="0" end="113">
    	<option>${2013-i}</option>
	</c:forEach>
		</select>
	</td>
</tr>
</table>


Mileage<input type="text" onkeypress="return isNumberKey(event)" name="mileage" value="" required><br>
Condition<select name="condition">
<option>Excellent</option>
<option>Good</option>
<option>Fair</option>
<option>Poor</option>
</select><br>




<input type="hidden" name="page" value="10">
<input type="submit" value="Add Vehicle"/>
</form>
<form action="administrator" method="post">
<input type="hidden" name="page" value="1">
<input type="submit" value="Cancel"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>
</body>
</html>
