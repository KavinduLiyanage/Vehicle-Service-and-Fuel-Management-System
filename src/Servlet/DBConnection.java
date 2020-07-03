package Servlet;

import java.sql.*;

public class DBConnection {
	
	public static Connection initializeDatabase() 
			throws SQLException, ClassNotFoundException 
		{ 
			// Initialize all the information regarding 
			// Database Connection 

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleservicedb","root","root");
			return con; 
		}

}
