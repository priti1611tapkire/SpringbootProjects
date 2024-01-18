<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">


function login()
  {
	alert("Hello Login Page");
	
	var un=document.getElementById("uname").value;
	var ps=document.getElementById("pass").value;
	alert(un);
	alert(ps);
	
	var req=new XMLHttpRequest();
	var url="http://localhost:8001/logincheck/"+un+"/"+ps+"";
	req.open("GET",url,true);
	req.send();
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
<pre>
Username
<input type="text" name="uname" id="uname"><br>
Password
<input type="password" name="pass" id="pass"><br>
<input type="button" value="login" onclick="login()">
<a href="register">New User</a>
</pre>
</body>
</html>