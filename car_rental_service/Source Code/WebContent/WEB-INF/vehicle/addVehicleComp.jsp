<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<div style="height:40px;background-color:green">


<title>Vehicle Components</title>
</head>
<body>

<form name="input" action="VehicleCompServlet" method="get">

<div style="height:40px;background-color:green">

<h1>Vehicle Components</h1>

<p>Vehicle Make & Model</p>
<p>New Vehicle Make: <input type= "text" name = "vecNewMake">  </p>
<p>New Vehicle Model: <input type= "text" name = "vecNewModel"> </p>



<div style="height:40px;background-color:green">

<h2>New Vehicle Type: </h2>
<p>Type: <input type= "text" name = "vecNewType1"></p>
<p>Hourly Rates <input type= "text" name = "vecNewType2"></p>
<p>Daily Rates <input type= "text" name = "vecNewType3"></p>

<div style="height:40px;background-color:green">

<h2>New Location</h2>
<p>Name <input type= "text" name = "vLocNewName"></p>
<p>Street 1 <input type= "text" name = "vLocNewStr1"></p>
<p>Street 2 <input type= "text" name = "vLocNewStr2"></p>
<p>City <input type= "text" name = "vLocNewCity"></p>
<p>State <input type= "text" name = "vLocNewState"></p>
<p>Zip <input type= "text" name = "vLocNewZip"></p>
<p>Capacity <input type= "text" name = "vLocCap"></p>
<div style="height:40px;background-color:green">

<p><input type="submit" value="Submit"></p>
</form>

</body>
</html>