<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<head>
	<title>Reserve a Vehicle</title>
	<script src="assets/application.js" type="text/javascript"></script>
</head>
<body onload="setDateTime();">

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



<h2>When do you want to reserve your car?</h2>

Location: <strong>${location_name}</strong><br>
Vehicle: <strong>${vehicle.make} ${vehicle.model}</strong><br>
Hourly Rate: <strong><fmt:formatNumber value="${vehicle.hour_rate}" type="currency"/>/hour</strong><br>
Daily Rate: <strong><fmt:formatNumber value="${vehicle.day_rate}" type="currency"/>/day</strong>

<br><br>
Pick Up
<form action="reserve" method="post" name="frm">
<table border="1">
<tr>
	<td><select name="month">
		<option value="1">January</option>
        <option value="2">February</option>
        <option value="3">March</option>
        <option value="4">April</option>
        <option value="5">May</option>
        <option value="6">June</option>
        <option value="7">July</option>
        <option value="8">August</option>
        <option value="9">September</option>
        <option value="10">October</option>
        <option value="11">November</option>
        <option value="12">December</option>
		</select>
	</td>
	<td><select name="day">
		<option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
        <option>13</option>
        <option>14</option>
        <option>15</option>
        <option>16</option>
        <option>17</option>
        <option>18</option>
        <option>19</option>
        <option>20</option>
        <option>21</option>
        <option>22</option>
        <option>23</option>
        <option>24</option>
        <option>25</option>
        <option>26</option>
        <option>27</option>
        <option>28</option>
        <option>29</option>
        <option>30</option>
        <option>31</option>
		</select>
	</td>
    <td><select name="year">
		<option>2013</option>
        <option>2014</option>
		</select>
	</td>
    <td><select name="hours">
    	<option>0</option>
		<option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
        <option>13</option>
        <option>14</option>
        <option>15</option>
        <option>16</option>
        <option>17</option>
        <option>18</option>
        <option>19</option>
        <option>20</option>
        <option>21</option>
        <option>22</option>
        <option>23</option>
		</select>
	:
	<select name="minute">
		<option>0</option>
		<option>5</option>
		<option>10</option>
		<option>15</option>
        <option>20</option>
        <option>25</option>
        <option>30</option>
        <option>35</option>
        <option>40</option>
        <option>45</option>
        <option>50</option>
        <option>55</option>
		</select>
	</td>
</tr>
</table>
<br>

Hours<input type="text" name="hour" placeholder="Enter 1-72" value="" required>
<input type="hidden" name="page" value="2">
<input type="hidden" name="location_name" value="${location_name}">
<input type="hidden" name="vehicle_id" value="${vehicle.id}">
<br><br>
<input type="submit" value="Continue"/>
</form>
<form action="customer" method="post">
<input type="submit" value="Cancel"/>
</form>

<c:forEach items="${error}" var="item" begin="0">
	<font color="red">${item}</font><br>
</c:forEach>

</body>
</html>
