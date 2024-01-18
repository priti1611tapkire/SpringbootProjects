<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function registerData() {

	alert("Welcome To Register Page ");
	
	var rollno=document.getElementById("rollno").value;
	var name=document.getElementById("name").value;
	var addr=document.getElementById("addr").value;
	var uname=document.getElementById("uname").value;
	var pass=document.getElementById("pass").value;
	
	var student={rollno:rollno,name:name,addr:addr,uname:uname,pass:pass}
	var stu=JSON.stringify(student);
	
	alert(uname);
	alert(pass);
	
	var req=new XMLHttpRequest();
	var url="http://localhost:8090/postdata";
	req.open("POST",url,true);
	req.setRequestHeader("content-type","application/json");
	req.send(stu);
	alert("Success");
	
	req.onreadystatechange=function()
	{
		if(req.readyState==4 && req.status==200)
			{
				alert(req.responseText);
			}
	}
	
}

</script>
<body>
<pre>
Roll No :-<input type="text" name="rollno" id="rollno">

Name    :-<input type="text" name="name" id="name">

Address  :-<input type="text" name="addr" id="addr">

UserName:-<input type="text" name="uname" id="uname">

Password:-<input type="password" name="pass" id="pass">

<input type="button" value="Register" onclick="registerData()">  
</pre>

</body>
</html>