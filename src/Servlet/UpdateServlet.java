package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Appointment;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>Update Appointment</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Appointment a=AppDBHandler.getAppointmentById(id);  
         
        out.print("<form action='UpdateServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+a.getId()+"'/></td></tr>"); 
        out.print("<tr><td>Vehicle Year:</td><td><input type='text' name='year' value='"+a.getVehicleYear()+"'/></td></tr>");
        out.print("<tr><td>Vehicle Type:</td><td><input type='text' name='type' value='"+a.getVehicleType()+"'/></td></tr>");
        out.print("<tr><td>Appointment Date:</td><td><input type='date' name='date' value='"+a.getAppointmentDate()+"'/></td></tr>");
        out.print("<tr><td>Time Frame:</td><td>");
        	out.print("<select name='time' style='width:150px'>");
        	out.print("<option>09.00 AM - 10.00 AM</option>");
        	out.print("<option>10.00 AM - 11.00 AM AM</option>");
        	out.print("<option>11.00 AM - 12.00 AM AM</option>");
        	out.print("<option>12.00 AM - 01.00 PM AM</option>");
        	out.print("<option>01.00 AM - 02.00 PM AM</option>");
        	out.print("<option>02.00 AM - 03.00 PM AM</option>");
        	out.print("<option>03.00 AM - 04.00 AM</option>");
        	out.print("<option>04.00 AM - 05.00 AM</option>");
        	out.print("</select>");  
            out.print("</td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+a.getName()+"'/></td></tr>");    
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+a.getEmail()+"'/></td></tr>");
        out.print("<tr><td>Contact Number:</td><td><input type='text' name='no' value='"+a.getContactNumber()+"'/></td></tr>");
        out.print("<tr><td>Questions and Comments:</td><td><input type='text' name='questionComment' value='"+a.getQuestionsandComments()+"'/></td></tr>");
        out.print("<tr><td colspan='2'><br><input type='submit' value='Update'/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
        
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
