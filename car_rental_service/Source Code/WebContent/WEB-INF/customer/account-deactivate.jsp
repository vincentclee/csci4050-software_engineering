<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Account Information</title>
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


<h2>Deactivate your account</h2>
Permanently deleting your account means you will not ever be able to reactivate or retrieve any of the content or information you've added.<br>

When you deactivate your account, your account and all information associated with it disappears from YouDrive immediately. <br>

If you’d like to come back to YouDrive anytime after you’ve deactivated your account, you will have to create a new account.<br><br><br>

<form action="customer" method="post">
Current Password<input type="password" name="password" value="IOwnDallasMavericks" required>
<input type="hidden" name="page" value="11">
<input type="submit" value="Deactivate"/>
</form>

<form action="customer" method="post">
<input type="hidden" name="page" value="0">
<input type="submit" value="Cancel"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

</body>
</html>
