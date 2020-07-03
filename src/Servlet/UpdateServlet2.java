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
 * Servlet implementation class UpdateServlet2
 */
@WebServlet("/UpdateServlet2")
public class UpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet2() {
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
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        
        PrintWriter out=response.getWriter();
      
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
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
        a.setId(id);  
        a.setVehicleYear(year);  
        a.setVehicleType(type); 
        a.setAppointmentDate(date);
        a.setTimeFrame(time); 
        a.setName(name);  
        a.setEmail(email); 
        a.setContactNumber(no);
        a.setQuestionsandComments(questionComment);
        
      
          
        int status=AppDBHandler.update2(a);  
        if(status>0){  
            out.print("<p>Successfully Updated!</p>");
            request.getRequestDispatcher("ViewServlet").include(request, response);  
        }else{  
            System.out.println("Sorry! unable to update record");  
        }  
          
        System.out.close();  
	}

}
