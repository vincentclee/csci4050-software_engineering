<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive User Control Panel</title>
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

<h2>Add Administrator</h2>
<form action="administrator" method="post">
Username<input type="text" name="username" value="" required><br>
Password<input type="password" name="password" value="" required><br>
Re-Enter Password<input type="password" name="password" value="" required><br>
First Name<input type="text" name="firstname" value="" placeholder="" required><br>
Middle Name<input type="text" name="middlename" value=""><br>
Last Name<input type="text" name="lastname" value="" required><br>
<input type="hidden" name="page" value="19">
<input type="submit" value="Add Administrator"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

<br><br>

<h2>Administrators</h2>

<table border="1">
<tr>
	<th>ID</th>
	<th>Username</th>
	<th>First Name</th>
	<th>Middle Name</th>
	<th>Last Name</th>
	<th>Registered</th>
	<th>Option</th>
</tr>

<c:forEach items="${administrators}" var="administrator" varStatus="i" begin="0">
<tr>
	<td>${i.count}</td>
	<td>${administrator.username}</td>
	<td>${administrator.firstname}</td>
	<td>${administrator.middlename}</td>
	<td>${administrator.lastname}</td>
	<td><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${administrator.registered}"/></td>
	<td>
	<form action="administrator" method="post">
	<input type="hidden" name="staff_id" value="${administrator.staff_id}">
	<input type="hidden" name="page" value="20">
	<input type="submit" value="Edit"/>
	</form>
	</td>
</tr>
</c:forEach>
</table>
<br>



<h2>Customers</h2>

<table border="1">
<tr>
	<th>ID</th>
	<th>Username</th>
	<th>First Name</th>
	<th>Middle Name</th>
	<th>Last Name</th>
	<th>Registered</th>
	<th>Email</th>
	<th>Balance</th>
	<th>Option</th>
</tr>

<c:forEach items="${customers}" var="customer" varStatus="i" begin="0">
<tr>
	<td>${i.count}</td>
	<td>${customer.username}</td>
	<td>${customer.license_firstname}</td>
	<td>${customer.license_middlename}</td>
	<td>${customer.license_lastname}</td>
	<td><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${customer.registered}"/></td>
	<td>${customer.email}</td>
	<td><fmt:formatNumber value="${customer.balance}" type="currency"/></td>
	<td>
	<form action="administrator" method="post">
	<input type="hidden" name="customer_id" value="${customer.customer_id}">
	<input type="hidden" name="page" value="23">
	<input type="submit" value="Edit"/>
	</form>
	</td>
</tr>
</c:forEach>
</table>
<br>


</body>
</html>
