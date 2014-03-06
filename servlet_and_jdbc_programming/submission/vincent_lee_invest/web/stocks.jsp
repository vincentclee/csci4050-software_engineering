<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>csx050 Finance Tracker</title>

<script language=Javascript>
//http://www.cambiaresearch.com/articles/39/how-can-i-use-javascript-to-allow-only-numbers-to-be-entered-in-a-textbox
function isNumberKey(evt) {
	var charCode = (evt.which) ? evt.which : event.keyCode
			if (charCode > 31 && (charCode < 48 || charCode > 57))
				return false;
	return true;
      }
</script>
</head>
<body>
<H1>csx050 Finance Tracker</H1>
<p>This site will calculate the total price of stock trade transaction.</p>
<p>Enter up to four companies based on their DOW Industrial Index symbol, and the number of shares requested.</p>

<form action="finance" method="post">
<table border="1">
<tr>
  <td><input type="text" onkeyup="this.value=this.value.toUpperCase();" name="symbol1" placeholder="symbol" value="${symbol1}"><font color="red">${symbol1error}</font></td>
  <td><input type="text" onkeypress="return isNumberKey(event)" name="quantity1" placeholder="quantity" value="${quantity1}"><font color="red">${quantity1error}</font></td>
</tr>
<tr>
  <td><input type="text" onkeyup="this.value=this.value.toUpperCase();" name="symbol2" placeholder="symbol" value="${symbol2}"><font color="red">${symbol2error}</font></td>
  <td><input type="text" onkeypress="return isNumberKey(event)" name="quantity2" placeholder="quantity" value="${quantity2}"><font color="red">${quantity2error}</font></td>
</tr>
<tr>
  <td><input type="text" onkeyup="this.value=this.value.toUpperCase();" name="symbol3" placeholder="symbol" value="${symbol3}"><font color="red">${symbol3error}</font></td>
  <td><input type="text" onkeypress="return isNumberKey(event)" name="quantity3" placeholder="quantity" value="${quantity3}"><font color="red">${quantity3error}</font></td>
</tr>
<tr>
  <td><input type="text" onkeyup="this.value=this.value.toUpperCase();" name="symbol4" placeholder="symbol" value="${symbol4}"><font color="red">${symbol4error}</font></td>
  <td><input type="text" onkeypress="return isNumberKey(event)" name="quantity4" placeholder="quantity" value="${quantity4}"><font color="red">${quantity4error}</font></td>
</tr>
</table>
<br>
<font color="red">${inputerror}</font>
<br>
<input type="submit" value="submit"/>
</form>



</body>
</html>