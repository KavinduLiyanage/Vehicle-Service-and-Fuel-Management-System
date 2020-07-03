package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDBHandler2 {
	
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleservicedb", "root", "root");
        
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int AddProduct(Product2 e){  
        int status=0;  
        try{  
            Connection con=ProductDBHandler2.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into `order`(id,iname,qty,des) values (?,?,?,?)");  
            ps.setString(1,e.getId());  
            ps.setString(2,e.getName());  
            ps.setInt(3,e.getQty()); 
            ps.setString(4, e.getDescription());
              
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Product2 e){  
        int status=0;  
        try{  
            Connection con=ProductDBHandler2.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update `order` set id=?,iname=?, qty=?,des=? where id=?");  
            ps.setString(1,e.getId());  
            ps.setString(2,e.getName());  
            ps.setInt(3,e.getQty()); 
            ps.setString(4, e.getDescription());
            ps.setString(5,e.getId()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
   
      
    
  
	

}
