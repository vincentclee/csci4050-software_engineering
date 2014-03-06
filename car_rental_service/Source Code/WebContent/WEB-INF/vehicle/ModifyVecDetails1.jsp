<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vehicle Details</title>
</head>
<body onload="aa('${vehicleRec}');" >
<div style="height:40px;background-color:green">
<h1>Edit Vehicle</h1>
<br>


<form name="input" action="VehicleModified" method="get">

<p>Current Make: [${vehicleRec.make}] </p>
<p>Make:  <input type= "text" name = "changeMake"> </p>
<p>Current Model: [${vehicleRec.model}] </p>
<p> Model:  <input type= "text" name = "changeModel"> </p>
<p>Current Year: [${vehicleRec.year}]  </p>
<p>Year: <input type= "text" name = "changeYear"> </p>
<p>Current Type: [${vehicleRec.vehicleType}] </p>
<p>Type: <input type= "text" name = "changeType"> </p>
<p>Hourly Date: ${vehicleRec.hourlyRate}  <input type= "text" name = "changeHourRate"> </p>
<p>Daily Date: ${vehicleRec.dailyRate}  <input type= "text" name = "changeDayRate"> </p>
<p>Current color [${vehicleRec.color}] </p>
<p>Color:  <input type= "text" name = "changeColor"> 

<input type="hidden" name="page" value="1">
<p><input type="submit" value="Submit Edits"></p>
</form>
<br>
<div style="height:40px;background-color:green">
</body>
</html>