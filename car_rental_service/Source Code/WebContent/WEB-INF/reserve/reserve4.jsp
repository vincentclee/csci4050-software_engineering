<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Reserve a Vehicle</title>
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



<h2>Confirmation</h2>


<strong>Location</strong><br>
${rental.name}<br>
${rental.street1}
${rental.street2}<br>
${rental.city}, 
${rental.state}
${rental.zip}

<br><br>
<strong>Vehicle</strong><br>
${rental.year} ${rental.make} ${rental.model}<br>
${rental.color} ${rental.type}

<br><br>
<strong>Price</strong><br>
Hours: ${rental.hours}<br>
Hour Rate: <fmt:formatNumber value="${rental.hour_rate}" type="currency"/><br>
Total: <fmt:formatNumber value="${rental.cost}" type="currency"/><br>
Start: ${rental.start_time}<br>
End: ${rental.end_time}<br><br>




<form action="reserve" method="post">
<input type="hidden" name="page" value="3">
<input type="submit" value="Reserve"/>
</form>
<form action="customer" method="post">
<input type="submit" value="Cancel"/>
</form>

</body>
</html>
