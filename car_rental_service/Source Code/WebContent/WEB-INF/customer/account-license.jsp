<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Account Information</title>
<script src="assets/application.js" type="text/javascript"></script>
</head>
<body onload="aa('${customer.license_state}');ab('<fmt:formatDate pattern="yyyy" value="${customer.license_expiration}"/>');ac('<fmt:formatDate pattern="M" value="${customer.license_expiration}"/>');ad('<fmt:formatDate pattern="d" value="${customer.license_expiration}"/>');ae('<fmt:formatDate pattern="yyyy" value="${customer.license_birthdate}"/>');af('<fmt:formatDate pattern="M" value="${customer.license_birthdate}"/>');ag('<fmt:formatDate pattern="d" value="${customer.license_birthdate}"/>');">



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
<form action="customer" method="post" name="frm">
First Name<input type="text" name="firstname" value="${customer.license_firstname}" required><br>
Middle Name<input type="text" name="middlename" value="${customer.license_middlename}"><br>
Last Name<input type="text" name="lastname" value="${customer.license_lastname}" required><br>
Date of Birth
<table border="1">
<tr>
	<td><select name="dob_month">
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
	<td><select name="dob_day">
		<c:forEach var="i" begin="1" end="31">
   			<option>${i}</option>
   		</c:forEach>
		</select>
	</td>
    <td><select name="dob_year">
    	<c:forEach var="i" begin="0" end="95">
    		<option>${1995-i}</option>
		</c:forEach>
		</select>
	</td>
</tr>
</table>

Driver's License #<input type="text" name="no" value="${customer.license_no}" required><br>
License Expiration
<table border="1">
<tr>
	<td><select name="exp_month">
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
	<td><select name="exp_day">
	<c:forEach var="i" begin="1" end="31">
   		<option>${i}</option>
   	</c:forEach>
		</select>
	</td>
    <td><select name="exp_year">
        <c:forEach var="i" begin="2013" end="2030">
    		<option>${i}</option>
		</c:forEach>
		</select>
	</td>
</tr>
</table>

License Issued in
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


<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

<input type="hidden" name="page" value="8">
<input type="submit" value="Save changes"/>
</form>
<form action="customer" method="post">
<input type="hidden" name="page" value="0">
<input type="submit" value="Cancel"/>
</form>
<br><br>

<h2>Additional Options</h2>2>
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
