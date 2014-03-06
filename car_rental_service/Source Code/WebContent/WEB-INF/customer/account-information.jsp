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


<h2>Account Settings</h2>
Username: ${customer.username}<br>
Email: ${customer.email}<br>
Phone Number: ${customer.phonenumber}<br>
<form action="customer" method="post">
<input type="hidden" name="page" value="1">
<input type="submit" value="Edit Account Settings"/>
</form>
<br><br>

<h2>Address</h2>
${customer.address_street1}<br>
<c:if test="${fn:length(customer.address_street2) != 0}">
	${customer.address_street2}<br>
</c:if>
${customer.address_city}, ${customer.address_state} ${customer.address_zip}<br>
<form action="customer" method="post">
<input type="hidden" name="page" value="2">
<input type="submit" value="Edit Address"/>
</form>
<br><br>


<h2>Credit Card</h2>
${customer.noMasked}<br>
Expires: <fmt:formatDate pattern="MM/yyyy" value="${customer.expires}"/><br><br>

<strong>Billing address</strong><br>
${customer.firstname} ${customer.lastname}<br>
${customer.street1}<br>
<c:if test="${fn:length(customer.street2) != 0}">
	${customer.street2}<br>
</c:if>
${customer.city}, ${customer.state} ${customer.zip}<br>
<form action="customer" method="post">
<input type="hidden" name="page" value="3">
<input type="submit" value="Edit Credit Card"/>
</form>
<br><br>


<h2>Driver's License</h2>
${customer.license_noMasked}<br>
Expires: <fmt:formatDate pattern="MM/yyyy" value="${customer.license_expiration}"/><br><br>

<strong>Name on license</strong><br>
${customer.license_firstname}
<c:if test="${fn:length(customer.license_middlename) != 0}">
	${customer.license_middlename}
</c:if>
${customer.license_lastname}<br>
State: ${customer.license_state}<br>
<form action="customer" method="post">
<input type="hidden" name="page" value="4">
<input type="submit" value="Edit Driver's License"/>
</form>
<br><br>


<h2>Additional Options</h2>
<form action="customer" method="post">
<input type="hidden" name="page" value="9">
<input type="submit" value="Terminate your membership"/>
</form>

<form action="customer" method="post">
<input type="hidden" name="page" value="10">
<input type="submit" value="Deactivate your account"/>
</form>


</body>
</html>
