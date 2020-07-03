package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Product2;
import Model.ProductDBHandler2;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServletr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServletr() {
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
		
		PrintWriter out=response.getWriter();  
        String id=request.getParameter("id");  
        String iname=request.getParameter("iname");  
        int qty=Integer.parseInt(request.getParameter("qty"));  
        String des=request.getParameter("des");   
         
       Product2 p =new Product2();  
       p.setId(id);  
       p.setName(iname);  
       p.setQty(qty);  
       p.setgetDescription(des);  
         
       int status=ProductDBHandler2.AddProduct(p);  
       if(status>0){  
           out.print("<p>Record saved successfully!</p>");  
           request.getRequestDispatcher("Order.jsp").include(request, response);  
       }else{  
           out.println("Sorry! unable to save record");  
       }  
         
       out.close();  
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
