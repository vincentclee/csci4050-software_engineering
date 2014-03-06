<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modify Vehicles</title>
</head>
<body>

<div style="height:40px;background-color:green">
<h1>Modify Vehicle <h1>

<h2>Vehicle Record: ${vehicleRec.make} ${vehicleRec.model} </h2> 
<p>Registration #: ${vehicleRec.regTag} </h3>

<div style="height:40px;background-color:green">
<br>
<br>

<form name="input" action="VehicleUpdateServlet" method="get">

<h2>Vehicle Information: </h2>
<p>Make: ${vehicleRec.make} </p>
</p> Model: ${vehicleRec.model}   </p>
<p>Year: ${vehicleRec.year}   </p>
<p>Type: ${vehicleRec.vehicleType} </p>
<p>Color: ${vehicleRec.color} </p>

<input type="submit" value="Edit">
</form>
<br>
<div style="height:40px;background-color:green">
<br>
<form name="input" action="VehicleUpdateServlet" method="post">

<h2>Vehicle Attributes: </h2>
<p>Registration #: ${vehicleRec.regTag} </p>
<p>Hourly Date: ${vehicleRec.hourlyRate}</p>
<p>Daily Date: ${vehicleRec.dailyRate}</p>
<p>Mileage: ${vehicleRec.mileage}</p>
<p>Date of Service: ${vehicleRec.serviceDate}</p>
<p>Current Condition: ${vehicleRec.condition}</p>

<div style="height:40px;background-color:green">

<br>

<h2>Vehicle Location: </h2>
<p>Name: ${vehicleRec.locName} </p>
<p>Address ${vehicleRec.str1},  ${vehicleRec.str2}</p>
<p>City : ${vehicleRec.city}, States: ${vehicleRec.state}, Zip Code: ${vehicleRec.zip}</p>

<input type="hidden" name="page" value="1">
<input type="submit" value="Edit">
</form>
<div style="height:40px;background-color:green">

<br>

<div style="height:40px;background-color:green">

</body>
</html>