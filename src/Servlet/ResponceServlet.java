package Servlet;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponceServlet
 */
@WebServlet("/ResponceServlet")
public class ResponceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponceServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Comparable> dataList = new ArrayList<Comparable>();
		
		ViewResponce responceist = new ViewResponce();
		ResultSet rs = null;
		try {
			rs = responceist.showresponce();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
			    dataList.add(rs.getString("AppointmentID"));
				dataList.add(rs.getString("VehicleType"));
				dataList.add(rs.getString("AppointmentDate"));
				dataList.add(rs.getString("PrefferedTimeFrame"));
				dataList.add(rs.getString("Name")) ;
				dataList.add(rs.getString("Email")) ;
				dataList.add(rs.getString("ContactNumber")) ;
				dataList.add(rs.getString("QuestionAndomments")) ;
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("data",dataList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("responce.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
