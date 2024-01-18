<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updatedata</title>
</head>
<body>
<form action="update">
<input type="hidden" name="id" value=${e.eid}><br><br>
Employee Name:-<input type="text" name="name" value=${e.name}><br><br>
Employye Address:-<input type="text" name="addr" value=${e.addr}><br><br>
Employee Username:-<input type="text" name="uname" value=${e.uname}><br><br>
Employee Password:-<input type="text" name="pass" value=${e.pass}><br><br>
<input type="submit" value="update">
</form>
</body>
</html>