<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vehicles Details</title>
</head>
<body>

<div style="height:40px;background-color:green">
<h1>Edit Vehicle</h1>
<form name="input" action="VehicleModified" method="post">
<br>

Current Registration #: [${vehicleRec.regTag}]
<p>Registration #: <input type= "text" name = "changeReg"> </p>
Current Mileage: [${vehicleRec.mileage}] 
<p>Mileage: <input type= "text" name = "changeMileage"> </p>
Current Date of Service: [${vehicleRec.serviceDate}]
<p>Date of Service:  <input type= "text" name = "changeServDate"> </p>
Current Condition: [${vehicleRec.condition}]
<p>Condition:  <input type= "text" name = "changeCondition"> </p>

<div style="height:40px;background-color:green">


<h2>Vehicle Location: </h2>
<p>Current Name: [${vehicleRec.locName}] </p>
<p>name <input type= "text" name = "changeLocName"></p>
<p>Current Str1 [${vehicleRec.str1}] </p>
<p>Street 1<input type= "text" name = "changeLocStr1"></p>
<p>Current Str2 [${vehicleRec.str2}] </p>
<p>Street 2<input type= "text" name = "changeLocStr2"></p>
<p>Current City : [${vehicleRec.city}] </p>
<p>City <input type= "text" name = "changeCity"></p>
<p>Current State: [${vehicleRec.state}] </p>
<p>State<input type= "text" name = "changeState"></p>
<p>Current Zip Code:  [${vehicleRec.zip}] </p>
<p>Zip Code<input type= "text" name = "changeZipCode"></p>


<input type="hidden" name="page" value="2">
<input type="submit" value="Submit">
<div style="height:40px;background-color:green">




</body>
</html>