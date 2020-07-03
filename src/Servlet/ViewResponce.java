package Servlet;

import java.sql.*;

public class ViewResponce {
	
public ResultSet showresponce() throws SQLException, ClassNotFoundException {
		
		Connection con = DBConnection.initializeDatabase();
		Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("select AppointmentID,VehicleType,AppointmentDate,PrefferedTimeFrame,Name,Email,ContactNumber,QuestionAndomments from appointmenttable WHERE Status is null");
	    return rs;
	}

}
