package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Appointment;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Appointment List</h1><br>");  
		out.println("<br><a href='appointment.jsp'><i>Add Appointment<i></a><br><br>");  
		
		List<Appointment> list=AppDBHandler.getAllAppointments();  
        
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Vehicle Year</th><th>Vehicle Type</th><th>Appointment Date</th><th>Time Frame</th><th>Selected Services</th><th>Name</th><th>Email</th><th>Contact Number</th><th>Questions and Comment</th><th>Update</th><th>Delete</th></tr>");  
        for(Appointment a:list){  
        	out.print("<tr><td>"+a.getId()+
        					"</td><td>"+a.getVehicleYear()+
        					"</td><td>"+a.getVehicleType()+
        					"</td><td>"+a.getAppointmentDate()+
        					"</td><td>"+a.getTimeFrame()+
        					"</td><td>"+a.getServiceType()+
        					"</td><td>"+a.getName()+
        					"</td><td>"+a.getEmail()+
        					"</td><td>"+a.getContactNumber()+
        					"</td><td>"+a.getQuestionsandComments()+
        					"</td><td><a href='UpdateServlet?id="+a.getId()+"'>Update</a></td><td><a href='DeleteServlet?id="+a.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
        out.print("</body>");  
          
        out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
