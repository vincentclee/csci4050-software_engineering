<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Vehicles</title>
</head>
<body>

<div style="height:40px;background-color:green">
<h1>Available Vehicles </h1>
<br>

<table border="2" width="1000">
	<tr>
		 <td>Rent</td>
		 <td>Make</td>
		 <td>Model</td>
		 <td>Type</td>
	  	<td>Hourly Cost</td>
	  	<td>Daily Cost</td>
    </tr>
	 		<c:forEach var="vehicles" items="${listVec}">
  		<form>
			  <tr>
			  <td><input type=radio name=vehicles > </td> 
					  <td> ${vehicles.make} </td>
					  <td> ${vehicles.model} </td>
					  <td> ${vehicles.vehicleType} </td>
					  <td> ${vehicles.hourlyRate} </td>
					  <td> ${vehicles.dailyRate} </td>
				</tr>	  
		 	 </form>
			</c:forEach>  
		</form>
	  </table>
	<br>
	<br>
<div style="height:40px;background-color:green">
	
	</body>
</html>