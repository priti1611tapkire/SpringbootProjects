<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>successpage</title>
</head>
<script type="text/javascript">
function deletedata() {
	alert("Delete");
	document.myaction.action="del";
	document.myaction.submit();
}
function editdata() {
	alert("Edit");
	document.myaction.action="edit";
	document.myaction.submit();
}
function addRecord(){
	alert("Add");
	document.myaction.action="add";
	document.myaction.submit();
}
function printdata() {
	print.window();
}
function printDiv()  
{ 
	var pdf=document.forms["myaction"]["sid"].value;
	alert("pdf");
	if(pdf==""){
		alert("PDF docx complete Data...!!")
			document.myaction.action="PDF";
		 	document.myaction.submit();
		}
	else{
		alert("PDF docx perticular Data...!!")
		alert("yes")
		document.myaction.action="PDFById/"+sid+"";
		alert("No")
		document.myaction.submit();
		
	}
	alert("successfully done")
} 
</script>
<body>
<div>
<form name="myaction">
<table border="1" align="center">
<tr>
<th>Sr.No</th>
<th>ID</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>MobileNo</th>
</tr>
<%List<Student> slist=(List)request.getAttribute("data"); %>
<%for(Student s:slist){ %>
<tr>
<td><input type="radio" name="sid" value="<%=s.getId()%>"></td>
<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getUname()%></td>
<td><%=s.getPass()%></td>
<td><%=s.getMobno()%></td>
</tr>
<%} %>
<tr>
<td><input type="button" value="Delete" onclick="deletedata()"></td>
<td><input type="button" value="Edit" onclick="editdata()"></td>
<td><input type="button" value="Print" onclick="printdata()"></td>
<td><input type="button" value="Add" onclick="addRecord()" > </td>
<td><input type="button" value="PDF" onclick= "printDiv()"></td>
</tr>
</table>
</form>
</div>
</body>
</html>