<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Account Information</title>
<script src="assets/application.js" type="text/javascript"></script>
</head>
<body onload="aa('${customer.address_state}');">
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
<form action="customer" method="post" name="frm">
Street1<input type="text" name="street1" value="${customer.address_street1}" required><br>
Street2<input type="text" name="street2" value="${customer.address_street2}"><br>
City<input type="text" name="city" value="${customer.address_city}" required><br>
State

<select name="state">
<option value="AL">Alabama</option>
<option value="AK">Alaska</option>
<option value="AZ">Arizona</option>
<option value="AR">Arkansas</option>
<option value="CA">California</option>
<option value="CO">Colorado</option>
<option value="CT">Connecticut</option>
<option value="DE">Delaware</option>
<option value="FL">Florida</option>
<option value="GA">Georgia</option>
<option value="HI">Hawaii</option>
<option value="ID">Idaho</option>
<option value="IL">Illinois</option>
<option value="IN">Indiana</option>
<option value="IA">Iowa</option>
<option value="KS">Kansas</option>
<option value="KY">Kentucky</option>
<option value="LA">Louisiana</option>
<option value="ME">Maine</option>
<option value="MD">Maryland</option>
<option value="MA">Massachusetts</option>
<option value="MI">Michigan</option>
<option value="MN">Minnesota</option>
<option value="MS">Mississippi</option>
<option value="MO">Missouri</option>
<option value="MT">Montana</option>
<option value="NE">Nebraska</option>
<option value="NV">Nevada</option>
<option value="NH">New Hampshire</option>
<option value="NJ">New Jersey</option>
<option value="NM">New Mexico</option>
<option value="NY">New York</option>
<option value="NC">North Carolina</option>
<option value="ND">North Dakota</option>
<option value="OH">Ohio</option>
<option value="OK">Oklahoma</option>
<option value="OR">Oregon</option>
<option value="PA">Pennsylvania</option>
<option value="RI">Rhode Island</option>
<option value="SC">South Carolina</option>
<option value="SD">South Dakota</option>
<option value="TN">Tennessee</option>
<option value="TX">Texas</option>
<option value="UT">Utah</option>
<option value="VT">Vermont</option>
<option value="VA">Virginia</option>
<option value="WA">Washington</option>
<option value="WV">West Virginia</option>
<option value="WI">Wisconsin</option>
<option value="WY">Wyoming</option>
</select><br>

ZIP Code<input type="text" name="zip" value="${customer.address_zip}" required><br>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

<input type="hidden" name="page" value="6">
<input type="submit" value="Save changes"/>
</form>
<form action="customer" method="post">
<input type="hidden" name="page" value="0">
<input type="submit" value="Cancel"/>
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
