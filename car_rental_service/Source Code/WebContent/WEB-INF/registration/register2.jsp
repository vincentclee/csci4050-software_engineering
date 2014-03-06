<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Register</title>
</head>
<body>

<table border="1" align="right">
<tr>
	<td><form action="login" method="post"><input type="submit" value="Log In"/></form></td>
</tr>>
</table>

<br><br>
<h1>YouDrive LOGO</h1>

<div style="height:40px;background-color:green">
<table border="1" align="right">
<tr>
  <td><form action="fleet" method="post"><input type="submit" value="Our Fleet"/></form></td>
  <td><form action="pricing" method="post"><input type="submit" value="Rates & Plans"/></form></td>
</tr></tr>
</table>
</div>

<h2>Pick a Driving Plan</h2>

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
<tr>
<form action="register" method="post">
 <c:forEach items="${memberships}" var="item" begin="0">
	<td><input type="submit" name="${item.id}" value="Select"></td>
</c:forEach>
<input type="hidden" name="step" value="2">
</form>
</tr>
</table>
<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

</body>
</html>
