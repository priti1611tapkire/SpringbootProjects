<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center><h1>ALL INFORMAITION</h1></center>

<script type="text/javascript">
function addUser() {
	alert("add")
	document.fn.action="register";
	document.fn.submit();
}
function deleteUser() {
	alert("delete")
	document.fn.action="del";
	document.fn.submit();
}
function editUser() {
	alert("edit");
	document.fn.action="edit";
	document.fn.submit();
}
function sortlist() {
	alert("sort");
	document.fn.action="sort";
	document.fn.submit();
}

</script>
</head>
<body>
	<form name="fn">
		<table border="1" align="center">
			<th>Sr No</th>
			<th>Id</th>
			<th>Name</th>
			<th>Pincode</th>
			<th>City Name</th>
			<th>Area Name</th>
			<th>Designation</th>
			<th>Username</th>
			<th>Password</th>
			<tr>
				<c:forEach items="${data}" var="user">
					<tr>
					<td><input type="radio" name="id" value="${user.id}"></td>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.address.pincode}</td>
					<td>${user.address.cityname}</td>
					<td>${user.address.areaname}</td>
					<td>${user.designation}</td>
					<td>${user.uname}</td>
					<td>${user.pass}</td>	
			</tr>
			</c:forEach>
		</table>
<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
<td><label for="sort">sort:</label>
<select name="option" id="sort">
 <option value="1">Option</option>
  <option value="2">ByName</option>
  <option value="3">ById</option>
  <option value="4">ByUname</option>
</select> 
<input type="text" name="option" id="sort">
<input type="button" value="Show" onclick = "sortlist()"></td>
</tr>
</table>
</form>
</body>
</html>