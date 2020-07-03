<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<link rel = "stylesheet"
	type = "text/css"
	href = "index.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order</title>
</head>
<body>
<div class = "header Text">
        <h1 style = "text-align:center; colour:#670070">Add Order</h1>
 <hr>
 
 			<div class="nav">
 				<div class="toggle">
 					<i class="fa fa-bars menu"></i>
 					
 <h2 style = "text-align:center; color:#670070"><u>Add Order</u> </h2>  
<form action="AddServlet" method="post">  
<table cellpadding="10" align="center" style="bavkground-color:#999a9b; border: 1px solid black; padding:20x;font-size: 20px">  
<tr><td>Item ID:</td><td><input type="text" name="id"/></td></tr>  
<tr><td>Item Name:</td><td><input type="iname" name="iname"/></td></tr>  
<tr><td>Quantity:</td><td><input type="qty" name="qty"/></td></tr>  
<tr><td>Description:</td><td><input type="des" name="des"/></td></tr>  
<tr><td colspan="2"><input type="submit" value="Add Order"/></td></tr>  
</table>  
</form>  
   
        





</body>
</html>