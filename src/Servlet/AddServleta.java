package Servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Product;
import service.ProductDBHandler;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServleta extends HttpServlet {

private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServleta() {
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
        String imanu=request.getParameter("imanu");
        int qty=Integer.parseInt(request.getParameter("qty"));  
         
       Product e=new Product(); 
       e.setName(id);  
       e.setId(iname); 
       e.setImanu(imanu);
       e.setQty(qty);  
         
       int status=ProductDBHandler.AddProduct(e);  
       if(status>0){  
           out.print("<p>New Item Added!</p>");  
           request.getRequestDispatcher("Order.jsp").include(request, response);  
       }else{  
           out.println("Sorry! unable to save record");  
       }  
         
       out.close();  
}
}
