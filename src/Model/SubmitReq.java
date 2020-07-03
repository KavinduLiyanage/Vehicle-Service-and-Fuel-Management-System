package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Servlet.DBConnection;
import util.publicVariable;

public class SubmitReq {
	public void responseReq() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.initializeDatabase();
		Statement stmt = con.createStatement();
	    stmt.executeUpdate("UPDATE appointmenttable SET Status = '"+publicVariable.permission+"' WHERE AppointmentID = "+publicVariable.appintId+"");
	}
}
