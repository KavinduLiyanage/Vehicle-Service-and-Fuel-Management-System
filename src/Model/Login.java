package Model;

import java.sql.*;

import util.*;

public class Login {
	public ResultSet addData(String name,String password) throws SQLException,ClassNotFoundException{
		Connection con=DBConnection.getMySQLConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select name,password from employee where name='"+name+"'and password='"+password+"'");
		return rs;
	}
}
