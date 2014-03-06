<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>YouDrive Location Control Panel</title>
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



<h2>Add Location</h2>
<form action="administrator" method="post">
Name<input type="text" name="name" value="" required><br>
Street1<input type="text" name="street1" value="" required><br>
Street2<input type="text" name="street2" value=""><br>
City<input type="text" name="city" value="" required><br>
State<select name="state">
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
</select>
<br>
ZIP<input type="text" name="zip" value="" required><br>
Capacity<input type="text" name="capacity" value="" required><br>
<input type="hidden" name="page" value="6">
<input type="submit" value="Add Location"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

<br><br>
<h2>Locations</h2>

<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Street1</th>
<th>Street2</th>
<th>City</th>
<th>State</th>
<th>ZIP</th>
<th>Capacity</th>
<th>Vehicles</th>
<th>Option</th>
</tr>

<c:forEach items="${locations}" var="location" varStatus="i" begin="0">
	<tr>
	<td>${i.count}</td>
	<td>${location.name}</td>
	<td>${location.street1}</td>
	<td>${location.street2}</td>
	<td>${location.city}</td>
	<td>${location.state}</td>
	<td>${location.zip}</td>
	<td>${location.capacity}</td>
	<td>${location.vehicles}</td>
	<td><form action="administrator" method="post"><input type="hidden" name="location_id" value="${location.location_id}"><input type="hidden" name="page" value="14"><input type="submit" value="Edit"/></form></td>
	</tr>
</c:forEach>
</table>

</body>
</html>
