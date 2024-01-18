<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2 style="color:red;"><u></u></h2>
<body>
<form action="update">
<input type="hidden" name="id" value=${s.id}>
<table border="1">
<tr>
<td> Name: </td>
<td> <input type="text" name="name" value=${s.name}> </td>
</tr>
<tr>
<td> Username: </td>
<td> <input type="text" name="uname" value=${s.uname}> </td>
</tr>
<tr>
<td> Password: </td>
<td> <input type="text" name="pass" value=${s.pass}> </td>
</tr>
<tr>
<td> Mobileno: </td>
<td> <input type="text" name="mobno" value=${s.mobno}> </td>
</tr>
<tr>
<td> <input type="submit" value="Update"> </td>
</tr>
</table>
</form>

</body>
</html>