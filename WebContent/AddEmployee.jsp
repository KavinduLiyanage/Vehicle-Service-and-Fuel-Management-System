<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #555;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #555;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=radio], select {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border-radius: 4px;
}

input[type=submit] {
  width: 75%;
  background-color: #7c0087;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=submit]:hover {
  background-color: #7c0087;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="background-color: linen">

<h1 style="color:#7c0087;margin-left:400px;">Add New Employee</h1>
<form action="SaveServlet" method="POST">
	
		<label>Employee Name:</label><br>
		<input style="width: 75%;" type="text" name="name"/><br>
		<label>Password:</label><br>
		<input style="width: 75%;" type="password" name="password"/><br>
		<lable>Employee Address:</lable><br>
		<input style="width: 75%;" type="text" name="address"><br>
		<lable>Employee Contact Number:</lable><br>
		<input style="width: 75%;" type="text" name="contact"><br>
		<lable>Employee Email:</lable><br>
		<input style="width: 75%;" type="text" name="email"><br>
		<lable>Gender:</lable><br>
		<input type="radio" name="gender" value="male" checked="checked" tabindex="1" /> Male<br>
		<input type="radio" name="gender" value="female" checked="checked" tabindex="1" /> Female<br>
		<lable>Employee Designation:</lable><br>
		<input style="width: 75%;" type="text" name="designation"><br>
		<lable class="l">Branch:</lable><br>
			 <select style="width: 75%;" name="branch" style="width:150px">  
					<option>Colombo</option>  
					<option>Galle</option>  
					<option>Kurunagala</option>  
					<option>Kandy</option>  
					</select>  
			
			<input type="submit" value="Save Employee"/>  
	
</form>

<br/>  
<a href="View">view employees</a>  

</body>
</html>