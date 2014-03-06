<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Our Fleet</title>
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
<h2>find cars by location</h2>
<c:forEach items="${locations}" var="location" begin="0">
	<strong>The ${location.name} - YouDrive Rental Location</strong><br>
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
	
	<form action="fleet" method="post">
	<input type="submit" value="Find Vehicles" style="width:680px"/>
	<input type="hidden" name="location_id" value="${location.location_id}">
	<input type="hidden" name="page" value="0">
	</form>
	<br><br>
</c:forEach>

<h2>find cars by manufacture</h2>

<form action="fleet" method="post">
<select name="make" onchange="this.form.submit()">
<c:forEach items="${makes}" var="make" begin="0">
<option>${make}</option>
</c:forEach>
</select>
<input type="hidden" name="page" value="1">
</form>


</body>
</html>
