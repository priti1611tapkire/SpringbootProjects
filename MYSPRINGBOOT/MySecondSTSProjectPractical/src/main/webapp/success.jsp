<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.example.demo.model.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function deleteRecord() {
	alert("delete");
	document.myform.action="delete";
	document.myform.submit();
}
function editData() {
	alert("edit");
	document.myform.action="edit";
	document.myform.submit();
}
function print() {
	print.window();
}


</script>
<body>
<form name="myform">
<table border="1" align="center">
<tr>
<th>Select</th>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>

</tr>
<c:forEach items="${data}" var="emp">
<tr>
<td><input type="radio" name="id" value="<c:out value="${emp.eid}"></c:out>"></td>
<td><c:out value="${emp.eid}"></c:out></td>
<td><c:out value="${emp.name}"></c:out></td>
<td><c:out value="${emp.addr}"></c:out></td>
<td><c:out value="${emp.uname}"></c:out></td>
<td><c:out value="${emp.pass}"></c:out></td>
</tr>
</c:forEach>
<tr>
<td><input type="button" value="delete" onclick="deleteRecord()"></td>
<td><input type="button" value="edit" onclick="editData()"></td>
<td><input type="button" value="print" onclick="print()"></td>
</tr>
</table>
</form>
</body>
</html>