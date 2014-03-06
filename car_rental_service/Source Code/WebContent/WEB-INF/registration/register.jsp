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
</tr>
</table>

<br><br>
<h1>YouDrive LOGO</h1>

<div style="height:40px;background-color:green">
<table border="1" align="right">
<tr>
  <td><form action="fleet" method="post"><input type="submit" value="Our Fleet"/></form></td>
  <td><form action="pricing" method="post"><input type="submit" value="Rates & Plans"/></form></td>
</tr>
</table>
</div>

<h2>Create a Profile</h2>

<form action="register" method="post">
Username<input type="text" name="username" placeholder="" value="" required><br>
Password<input type="password" name="password" value="" required><br>
Re-Type Password<input type="password" name="password" value="" required><br>
Email<input type="text" name="email" value="" required><br>
<input type="hidden" name="step" value="0">

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>


<br>
<input type="submit" value="Continue"/>
</form>
</body>
</html>
