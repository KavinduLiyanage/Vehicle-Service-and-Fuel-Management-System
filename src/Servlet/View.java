package Servlet;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Emp;
import Model.EmpDao;

@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter(); 
	        out.print("<body style=style=\"background-color: linen\">");
	        out.println("<a href='AddEmployee.jsp'>Add New Employee</a>");  
	        out.println("<h1 style=\"color:#7c0087;margin-left:400px;\">Employees List</h1>");  
	          
	        List<Emp> list=EmpDao.getAllEmployees();  
	          
	        out.print("<table style=\"background-color:#999a9b;\" border='1' width='100%'>");  
	        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Address</th><th>ContactNumber</th><th>Email</th><th>Gender</th><th>Designation</th><th>Branch</th><th>Edit Profile</th><th>Delete</th></tr>");  
	        for(Emp e:list){  
	         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getAddress()+"</td><td>"+e.getContactNumber() +"</td><td>"+e.getEmail()+"</td><td>"+e.getGender()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getBranch()+"</td><td><a href='EditServlet?id="+e.getId()+"'>Edit</a></td><td><a href='Delete?id="+e.getId()+"'>Delete</a></td></tr>");  
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
