<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<Style>
body {background-color:#ecc6d9;}
h1 {color:#7c0087;text-decoration: underline;}
</Style>
</head>

<body>

	<h1 text align="center" >Add Appointment</h1>  
	<form action="AddServlet" method="post" >
	  
	<table cellpadding="3"style="padding:30px ; background-color:#999a9b ;font-size:20px " align="center">  
	<tr>
		<td>Vehicle Year</td>
		<td><input type="text" name="year" placeholder="Enter year" hover="blue"/></td>
	</tr>
		  
	<tr>
		<td>Vehicle Type</td>
		<td><input type="text" name="type" placeholder="Enter type"/></td>
	</tr>
	
	<tr>
		<td>Appointment Date</td>
		<td><input type="date" name="date" required /></td>
	</tr>
	
	<tr>
		<td>Time Frame</td>
		<td><select name="time"  style="width:150px "> 
			<option>09.00 AM - 10.00 AM</option>  
			<option>10.00 AM - 11.00 AM</option> 
			<option>11.00 AM - 12.00 AM</option> 
			<option>12.00 AM - 01.00 PM</option> 
			<option>01.00 AM - 02.00 PM</option> 
			<option>02.00 AM - 03.00 PM</option> 
			<option>03.00 AM - 04.00 AM</option> 
			<option>04.00 AM - 05.00 AM</option> 
		</select>  
	</tr>
	  
	<tr>
	<td>Selected Services</td>
	</tr>
	<tr>
		<td align="right">
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="1. Air Conditioning"><br>
 			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="2. Break Repair"><br>
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="3. Heating and Cooling"><br>
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="4. Wheel Alignment"><br>
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="5. Transmission Repair"><br>
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="6. Steering and Suspension"><br>
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="7. Oil,Tube and Filters"><br>
			<input style=border:none;background-color:#999a9b;font-size:15px type="text" readonly value="8. Engine Diagnostics"><br>
		</td>
	</tr>
	<tr>
		<td>Numbers of Appointment type</td>
		<td><input type="text" name="vehicle" placeholder="Enter 1-8 service no" hover="blue"5></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="name" placeholder="Enter name"/></td>
	</tr>
	
	<tr>
		<td>Email</td>
		<td><input type="email" name="email" placeholder="Enter valid email address"/></td>
	</tr>
	
	<tr>
		<td>Contact Number</td>
		<td><input type="text" name="no" placeholder="Enter contact number" maxlength="10" required /></td>
	</tr>
	
	<tr>
		<td>Questions and Comments</td>
		<td><input type="text" name="questionComment" placeholder="Enter questions/comments" /></td>
	</tr>
	
	 
	<tr>
		<td colspan="2"><br><input type="submit" style=" background-color:#7c0087; font-size:20px "value="Add Appointment"/></td>
	</tr>
	  
	 <tr>	
		<td colspan="2"><input type="reset" style=" background-color:#7c0087 ;font-size:20px" value="Reset" class="reset-button" /></td>
	 </tr>
	 
	<br/> 
	 <tr>	 
		<td colspan="2"><a href="ViewServlet"><p style="text-align:center"><i>view Appointment</i></a></td>
	 </tr> 
</table>

	
</form>  
  
	        
</body>
</html>