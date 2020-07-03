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

@WebServlet("/EditSrevlet2")
public class EditSrevlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditSrevlet2() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        int eid=Integer.parseInt(request.getParameter("id"));  
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");
	        String address=request.getParameter("address");  
	        String ContactNumber=request.getParameter("contact"); 
	        String email=request.getParameter("email");  
	        String gender=request.getParameter("gender");  
	        String Designation=request.getParameter("designation");  
	        String brach=request.getParameter("brach"); 
	          
	        Emp ob1=new Emp();  
	        ob1.setId(eid);  
	        ob1.setName(name);  
	        ob1.setPassword(password);
	        ob1.setAddress(address); 
			ob1.setContactNumber(ContactNumber); 
	        ob1.setEmail(email);  
	        ob1.setEmail(gender);  
	        ob1.setDesignation(Designation);  
	        ob1.setBranch(brach); 
	          
	        int status=EmpDao.update(ob1);  
	        if(status>0){  
	            response.sendRedirect("View");  
	        }else{  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
	    }  
	}


