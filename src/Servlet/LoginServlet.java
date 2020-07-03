package Servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Login;
import util.publicVariable;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String uname = request.getParameter("name");
	    String  upass= request.getParameter("pass");
	    
	    try {
	      Login lg = new Login();
	      ResultSet rs = lg.addData(uname, upass);
	      
	      if(rs.next()) {
	    	  publicVariable.userName = rs.getString("name"); 
	        response.sendRedirect("index.jsp");
	        HttpSession session = request.getSession();
	        session.setAttribute("name", uname);
	        
	        
	      }else {
	    	  publicVariable.Error = "error";
	    	  response.sendRedirect("login.jsp");
	      }
	      
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	}

}
