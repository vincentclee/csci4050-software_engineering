<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive Control Panel</title>
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



<h2>Edit Account Information</h2>
<form action="administrator" method="post">
Old Password<input type="text" name="password_old" value=""><br>
New Password<input type="text" name="password" value=""><br>
Re-Enter Password<input type="text" name="password" value=""><br>
<br>
Username<input type="text" name="username" value="${administrator.username}" disabled><br>
First Name<input type="text" name="firstname" value="${administrator.firstname}" required><br>
Middle Name<input type="text" name="middlename" value="${administrator.middlename}"><br>
Last Name<input type="text" name="lastname" value="${administrator.lastname}" required><br>
<input type="hidden" name="user_id" value="${administrator.user_id}">
<input type="hidden" name="page" value="18">
<input type="submit" value="Save changes"/>
</form>
<form action="administrator" method="post">
<input type="hidden" name="page" value="0">
<input type="submit" value="Cancel"/>
</form>
<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

</form>

</body>
</html>
