package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	PrintWriter out=response.getWriter();  
	        String year=request.getParameter("year");  
	        String type=request.getParameter("type");  
	        String date=request.getParameter("date");  
	        String time=request.getParameter("time");
	        String ServiceType = request.getParameter("vehicle");
	        String name=request.getParameter("name");
	        String email=request.getParameter("email");
	        String no=request.getParameter("no");
	        String questionComment=request.getParameter("questionComment");
	        
	        
	          
	        Appointment a=new Appointment();  
	        a.setVehicleYear(year);  
	        a.setVehicleType(type); 
	        a.setAppointmentDate(date);
	        a.setTimeFrame(time);
	        a.setServiceType(ServiceType);
	        a.setName(name);  
	        a.setEmail(email); 
	        a.setContactNumber(no);
	        a.setQuestionsandComments(questionComment);
	       
	          
	        int status=AppDBHandler.AddApp(a);  
	        if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("appointment.jsp").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    

	        
	}

}
