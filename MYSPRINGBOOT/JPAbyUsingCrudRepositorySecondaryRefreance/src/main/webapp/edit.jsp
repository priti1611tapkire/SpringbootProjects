<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1 align="center">EDIT DATA</h1>
</head>
<body>
<form action="update">
<table border="1">

<input type="hidden" name="id" value="${data.id}">

<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>City Name:-</td>
<td><input type="text" name="address.cityname" value="${data.address.cityname}"></td>
</tr>
<tr>
<td>Area Name:-</td>
<td><input type="text" name="address.areaname" value="${data.address.areaname}"></td>
</tr>
<tr>
<td>Designation:-</td>
<td><input type="text" name="designation" value="${data.designation}"></td>
</tr>
<tr>
<td>User Name:-</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>
<tr>
<td>Password:-</td>
<td><input type="text" name="pass" value="${data.pass}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>