<%@page import="com.example.demo.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h2 style="color:purple;"><u> Employee Data : </u></h2>
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
</script>
<form name="myform">
<table border="1">
<tr>
<th> SNO </th>
<th> Id </th>
<th> Name </th>
<th> Adharno </th>
<th> PancardNo </th>
<th> AreaName </th>
<th> Cityname </th>
<th> Username </th>
<th> Password </th>
</tr>
<% List<Employee> elist=(List)request.getAttribute("data"); %>
<% for(Employee e:elist) { %>
<tr>
 <td> <input type="radio" name="eid" value="<%=e.getId() %>"></td>
<td> <%=e.getId()%> </td>
<td> <%=e.getName() %> </td>
<td> <%=e.getPesonaldetails().getAdharno()%> </td>
<td> <%=e.getPesonaldetails().getPancardno() %> </td>
<td> <%=e.getPesonaldetails().getAddress().getAreaname()%></td>
<td> <%=e.getPesonaldetails().getAddress().getCityname()%></td>
<td><%=e.getUname() %>
<td><%=e.getPass() %>
</tr>
<% } %>
 <tr>
<td><input type="button" value="Delete" onclick="deleteRecord()" > </td>
<td><input type="button" value="Update" onclick="updateRecord()" > </td>
<td><input type="button" value="Add" onclick="addRecord()" > </td>
</tr>
</table>
</form>
</body>
</html>