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

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter(); 
	        out.print("<style>\r\n" + 
	        		"input[type=text], select {\r\n" + 
	        		"  width: 75%;\r\n" + 
	        		"  padding: 12px 20px;\r\n" + 
	        		"  margin: 8px 0;\r\n" + 
	        		"  display: inline-block;\r\n" + 
	        		"  border: 1px solid #555;\r\n" + 
	        		"  border-radius: 4px;\r\n" + 
	        		"  box-sizing: border-box;\r\n" + 
	        		"}\r\n" + 
	        		"input[type=password], select {\r\n" + 
	        		"  width: 75%;\r\n" + 
	        		"  padding: 12px 20px;\r\n" + 
	        		"  margin: 8px 0;\r\n" + 
	        		"  display: inline-block;\r\n" + 
	        		"  border: 1px solid #555;\r\n" + 
	        		"  border-radius: 4px;\r\n" + 
	        		"  box-sizing: border-box;\r\n" + 
	        		"}\r\n"+
	        		"input[type=submit] {\r\n" + 
	        		"  width: 75%;\r\n" + 
	        		"  background-color: #7c0087;\r\n" + 
	        		"  color: white;\r\n" + 
	        		"  padding: 14px 20px;\r\n" + 
	        		"  margin: 8px 0;\r\n" + 
	        		"  border: none;\r\n" + 
	        		"  border-radius: 4px;\r\n" + 
	        		"  cursor: pointer;\r\n" + 
	        		"}\r\n" + 
	        		"input[type=submit]:hover {\r\n" + 
	        		"  background-color: #45a049;\r\n" + 
	        		"}\r\n" + 
	        		"</style>");
	        out.print("<body style=\"background-color: linen\">");
	        out.println("<h1 style=\"color:#7c0087;margin-left:400px;\">Update Employee</h1>");   
	          
	        Emp e=EmpDao.getEmployeeById(Integer.parseInt(request.getParameter("id")));  
	          
	        
	        out.print("<form action='EditSrevlet2' method='post'>");  
	        out.print("<lable></lable><br><input type='hidden' name='id' value='"+e.getId()+"'/><br>");  
	        out.print("<lable>Name:</lable><br><input type='text' name='name' value='"+e.getName()+"'/><br>");  
	        out.print("<lable>Password:</lable><br><input type='password' name='password' value='"+e.getPassword()+"'/><br>");  
	        out.print("<lable>Address:</lable><br><input type='text' name='address' value='"+e.getAddress()+"'/><br>");
	        out.print("<lable>Contact Number:</lable><br><input type='text' name='contact' value='"+e.getContactNumber()+"'/><br>");
	        out.print("<lable>Email:</lable><br><input type='text' name='email' value='"+e.getEmail()+"'/><br>");  
	        out.print("<lable>Gender:</lable><br><input type='radio' name='gender' value='"+e.getGender()+"' checked='checked' tabindex='1'/> Male<br>\r\n <input type='radio' name='gender' value='"+e.getGender()+"' checked='checked' tabindex='1'/> Female<br><br><br>"); 
	        out.print("<lable>Designation:</lable><br><input type='text' name='designation' value='"+e.getDesignation()+"'/><br>");  
	        out.print("<lable>Branch:</lable><br>");  
	        out.print("<select style='width: 75%;' name='branch' style='width:150px' name='branch' style='width:150px'>");  
	        out.print("<option>Colombo</option>");  
	        out.print("<option>Galle</option>");  
	        out.print("<option>Kurunagala</option>");  
	        out.print("<option>Kandy</option>");  
	        out.print("</select><br>");  
	        out.print("<input type='submit' value='Edit & Save'/>");    
	        out.print("</form>"); 
	        
	        
	        out.print("</body>");
	          
	        out.close();  
	    }  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
