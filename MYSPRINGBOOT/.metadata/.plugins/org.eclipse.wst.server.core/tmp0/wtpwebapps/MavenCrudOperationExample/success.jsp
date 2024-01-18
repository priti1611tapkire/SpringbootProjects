
<%@page import="com.cjc.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function deleteRecord(){
	alert("Delete");
	document.myform.action="delete";
	document.myform.submit();
}
function updateRecord(){
	alert("Update");
	document.myform.action="edit";
	document.myform.submit();
}
function addRecord(){
	alert("Add");
	document.myform.action="add";
	document.myform.submit();
}
function print(){
	window.print();
}
</script>
</head>
<body>
<form action="myform">
<h2>Employee Details</h2>
<div>
<table border="1" align="center">
<tr>
<th>Select</th>
<th>Id</th>
<th>Name</th>
<th>Address</th>
<th>Username</th>
<th>Password</th>
</tr>
<%List<Employee> elist=(List)request.getAttribute("data");
for(Employee e1:elist){
%>
<tr>
<td><input type="radio" name="id" value="<%=e1.getEid()%>">
<td><%=e1.getEid() %></td>
<td><%=e1.getName() %></td>
<td><%=e1.getAddr() %></td>
<td><%=e1.getUname()%></td>
<td><%=e1.getPass() %></td>
</tr>
<%} %>
<tr>
<td><input type="button" value="Delete" onclick="deleteRecord()"></td>
<td><input type="button" value="Update" onclick="updateRecord()"></td>
<td><input type="button" value="Add" onclick="addRecord()"></td>
<td><input type="button" value="Print" onclick="print()"></td>
</tr>
</table>
</div>
</form>
</body>
</html>