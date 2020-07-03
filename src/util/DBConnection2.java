package util;

import java.sql.*;

public class DBConnection2 {

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
