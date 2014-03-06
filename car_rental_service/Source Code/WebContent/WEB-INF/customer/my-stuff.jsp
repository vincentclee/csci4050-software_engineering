<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>My Stuff</title>
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



<h2>My Reservations</h2>
<table border="1">
<tr>
<th>ID</th>
<th>Vehicle</th>
<th>Type</th>
<th>Location</th>
<th>Start Time</th>
<th>End Time</th>
<th>Returned Time</th>
<th>Price</th>
</tr>

<c:forEach items="${rentals}" var="rental" varStatus="i" begin="0">
	<tr>
	<td>${i.count}</td>
	<td>${rental.year} ${rental.make} ${rental.model}</td>
	<td>${rental.color} ${rental.type}</td>
	<td>${rental.name}</td>
	<td><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${rental.start_time}"/></td>
	<td><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${rental.end_time}"/></td>
	
	<c:if test="${rental.returned eq null}">
		<td>
		<c:if test="${rental.cancelled eq true}">
		Cancelled
		</c:if>
		
		<c:if test="${rental.cancelled ne true}">
		<table>
		<form action="customer" method="post">
		<input type="hidden" name="rental_id" value="${rental.rental_id}">
		<input type="hidden" name="page" value="16">
		<input type="submit" value="Cancel" onclick="return confirm('Are you sure you want to cancel this vehicle reservation?')" style="width:50%"/>
		</form>
		
		<form action="customer" method="post">
		<input type="hidden" name="rental_id" value="${rental.rental_id}">
		<input type="hidden" name="page" value="15">
		<input type="submit" value="Return" onclick="return confirm('Are you sure you want to return this vehicle?')" style="width:50%"/>
		</form>
		</table>
		</c:if>
		</td>
	</c:if>
	<c:if test="${rental.returned ne null}">
		<td><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${rental.returned}"/></td>
	</c:if>
	
	
	<td><fmt:formatNumber type="currency" value="${rental.cost}"/></td>
	</tr>
</c:forEach>
</table>
<br>




<h2>Account Information</h2>

<ul>
	<li>Account creation: <strong><fmt:formatDate type="both" value="${customer.registered}"/></strong></li>
	<li>E-mail: <strong>${customer.email}</strong></li>
	<li>
	
	
<table>
<tr>
  <td>Subscription Type: <strong>${customer.membership_name}</strong></td>
  <td><c:if test="${customer.membership_name eq 'Free'}">
			<form action="customer" method="post"><input type="hidden" name="page" value="13"><input type="submit" value="Upgrade"/></form>
		</c:if>
		<c:if test="${customer.membership_name ne 'Free'}">
			<form action="customer" method="post"><input type="hidden" name="page" value="13"><input type="submit" value="Renew"/></form>
		</c:if></td>
</tr>
</table>
	</li>
	
	<c:if test="${customer.membership_name ne 'Free'}">
		<li>Valid until: <strong><fmt:formatDate type="both" value="${customer.membership_exp}"/></strong></li>
	</c:if>
	<li>Balance: <strong><fmt:formatNumber type="currency" value="${customer.balance}"/></strong></li>
</ul>
<form action="customer" method="post">
<input type="hidden" name="page" value="0">
<input type="submit" value="Change Account Information"/>
</form>



</body>
</html>
