<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ADD VEHICLE</title>
</head>
<body>

<div style="height:40px;background-color:green">

<h1>You Drive: New Vehicle</h1>

<p>Enter the following information below to add a new vehicle!!</p>


<form name="input" action="VehicleServlet" method="post">


<p>Make: <input type= "text" name = "vecMake">  Model: <input type="text" name="vecModel"></p>
<p>Type: <input type= "text" name = "vecType"> Location: <input type= "text" name = "vecLoc"></p>
 

<p>Reg # <input type = "text" name = "vecReg"> Year: <input type= "text"   name = "vecYear"></p>
<p>Color: <input type= "text" name = "vecColor"> Mileage <input type = "text" name = "vecMileage"></p>
<p>Cond <input type= "text" name = "vecCon"></p>





<input type="submit" value="Submit">

</form>
<div style="height:40px;background-color:green">
  


</body>
</html>