<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page language="java" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="SubmitAppointmentReqServlet" method="post">
	<table border="1">
		<tr>
			
			<td><b>AppointmentID</b></td>
		    <td><b>Vehicle Type</b></td>
			<td><b>Appointment Date</b></td>
			<td><b>Preffered Time Frame</b></td>
			<td><b>Name</b></td>
			<td><b>Email</b></td>
			<td><b>Contact Number</b></td>
			<td><b>Question and Comments</b></td>
			<td colspan="2"></td>
		</tr>
			<% Iterator itr;%>
			<% List data= (List)request.getAttribute("data");
			for (itr=data.iterator(); itr.hasNext(); )
			{
				String AppointmentID = (String) itr.next();

				
			%>
			
			<tr>
			<td><%=AppointmentID %></td>
			<td><%=itr.next()%></td>
			<td><%=itr.next()%></td>
			<td><%=itr.next()%></td>
			<td><%=itr.next()%></td>
			<td><%=itr.next()%></td>
			<td><%=itr.next()%></td>
			<td><%=itr.next()%></td>
			<td><a href="SubmitAppointmentReqServlet?appointment=<%=AppointmentID %>&status=Accept">Accept</a></td>
			<td><a href="SubmitAppointmentReqServlet?appointment=<%=AppointmentID %>&status=Decline">Decline</a></td>
		</tr>
			<%} %>
	</table>
	</form>
</body>
</html>