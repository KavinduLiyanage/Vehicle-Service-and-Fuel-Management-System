package util;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getMySQLConnection()
	         throws ClassNotFoundException, SQLException {
	     // Note: Change the connection parameters accordingly.
	     String hostName = "localhost";
	     String dbName = "vehicleservicedb";
	     String userName = "root";
	     String password = "root";
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	  
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	    
	     Class.forName("com.mysql.jdbc.Driver");
	  
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	  
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
	 
	 
}
