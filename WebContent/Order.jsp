<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "index.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<div class="headerText">
       <h1 style = "text-align:center; color:#670070">Vehicle Service and Fuel Management System</h1>
 <hr>

        <div class="nav">
            <div class="toggle">
                <i class="fa fa-bars menu"></i>
            </div>
            <ul class="ulist">
                <li><a class="header-home" href="index.jsp">Home</a></li>
                <li><a class="header-contact" href="Order.jsp">Add New Item</a></li>
                <li><a class="header-uplo" href="AddEmployee.jsp">Add Account</a></li>
                <li><a class="header-app" href="appointment.jsp">Appointments</a></li>
                <li><a class="header-app" href="appointment.jsp">Customer Request</a></li>
				<li><a class="header-pro" href="Logout.jsp">Log Out</a></li>
            </ul>
            
        </div>
    </div>
<h2 style = "text-align:center; color:#670070"><u>Add New Item to Stock</u></h2>
<form action="AddServlet" method="post">  
<table cellpadding="10" align="center" style="background-color:#999a9b;  border: 1px solid black; padding:20px;font-size: 20px ">  
<tr >
	<td>Item ID:</td>
	<td><input type="text" name="id"/></td>
</tr>  
<tr>
	<td>Item Name:</td>
	<td><input type="text" name="iname"/></td>
</tr>
<tr>
	<td>Item Manufacturer:</td>
	<td><input type="text" name="imanu"/></td>
</tr>  
<tr>
	<td>Quantity:</td>
	<td><input type="text" name="qty"/></td>
</tr>  
<tr>
	<td align="center"  cellpadding="20" colspan="2" ><input style="width: 20em; height: 3em;background-color:#7c0087;font-size: 20px;color:white" type="submit" value="Add Item"/></td>
</tr>  
<tr>	 
		<td align="center"  cellpadding="20" colspan="2" style="width: 20em; height: 3em;background-color:#7c0087;font-size: 20px;color:white"><a style="color:white" href="ViewServlet"><i>View Current Stock</i></a></td>
	 </tr>
</table>  
</form>  
</body>
</html>