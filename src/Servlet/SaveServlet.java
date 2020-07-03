package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Emp;
import Model.EmpDao;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		        response.setContentType("text/html");  
		        PrintWriter out=response.getWriter();  
		         
		        String name=request.getParameter("name"); 
		        String password=request.getParameter("password");
		        String address=request.getParameter("address"); 
		        String contactNo=request.getParameter("contact");
		        String email=request.getParameter("email");
		        String gender=request.getParameter("gender");
		        String designation=request.getParameter("designation");  
		        String branch=request.getParameter("branch");
		          
		        Emp e=new Emp();  
		      
		        e.setName(name);  
		        e.setPassword(password);
		        e.setAddress(address);  
				e.setContactNumber(contactNo); 
		        e.setEmail(email);  
		        e.setGender(gender);
		        e.setDesignation(designation); 
		        e.setBranch(branch);  
		          
		       int status=EmpDao.save(e);  
		        if(status>0){  
		            out.print("<p>Record saved successfully!</p>");  
		            request.getRequestDispatcher("AddEmployee.jsp").include(request, response);  
		        }else{  
		            out.println("Sorry! unable to save record");  
		        }  
		          
		        out.close();  
		        
		
	}

}
