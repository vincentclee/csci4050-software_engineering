<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Results</title>
</head>
<body>
<H1>Results</H1>

<table border="1">
	<tr>
		<th>Symbol</th>
		<th>Name</th>
		<th>Exchange</th>
		<th>Industry</th>
		<th>Added On</th>
		<th>Price per Share</th>
		<th>Quantity</th>
		<th>Total</th>
	</tr>
	<c:forEach items="${results}" var="item" begin="0">
	<tr>
		<td>${item.key}</td>
		<c:forEach items="${item.value}" var="values" begin="0" end="3">
			<td>${values}</td>
		</c:forEach>

		<fmt:setLocale value="en_US"/>
		<td><fmt:formatNumber value="${item.value[4]}" type="currency"/></td>
		<td>${item.value[5]}</td>
		<td><fmt:formatNumber value="${item.value[6]}" type="currency"/></td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="6">Totals</td>
		<td>${shares}</td>
		<td><fmt:formatNumber value="${total}" type="currency"/></td>
	</tr>
</table>
<br>
<form action="finance" method="get">
	<input type="submit" value="Query again"/>
</form>


</body>
</html>