<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page language="java" import ="util.publicVariable"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Login Here</h1>

<form onsubmit="return Login()" action="LoginServlet" method="POST">
	UserName:<input type="text" name="name"><br><br>
	Password:<input type="password" name="pass"><br><br>
	<input type="submit" value="login">
</form>

<%
	if(publicVariable.Error!=null){
		%>
		<h2>Invalid UserName and Password</h2>
<% 	}%>

</body>
</html>