<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Vehicles</title>
</head>
<body>
<div style="height:40px;background-color:green">
<h1>Search for a Vehicle</h1>


 <form name="input" action="VehicleServlet" method="get">
 
 <h3>Find your vehicle, and Rent today!!!</h3>


City:
<select name="city">
  <option value="Athens">Athens</option>
  <option value="Los Angeles">Los Angeles</option>
</select>

State:
<select name="state">
  <option value="GA">GA</option>
  <option value="CA">CA</option>
</select>  
<input type="submit" value="Submit">
</form> 



<div style="height:40px;background-color:green">
</body>
</html>