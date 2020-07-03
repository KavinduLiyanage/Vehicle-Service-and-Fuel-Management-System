package service;

import java.sql.*;

import java.util.*;

import Model.Product;
import service.ProductDBHandler;
import util.DBConnection2;

public class ProductDBHandler {

	public static int AddProduct(Product e){  
        int status=0;  
        try{  
            Connection con=DBConnection2.initializeDatabase();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into `order`(id,iname,imanu,qty) values (?,?,?,?)");  
            ps.setString(1,e.getId());  
            ps.setString(2,e.getName());
            ps.setString(3,e.getImanu()); 
            ps.setInt(4,e.getQty()); 
             
              
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Product e){  
        int status=0;  
        try{  
            Connection con=DBConnection2.initializeDatabase();  
            PreparedStatement ps=con.prepareStatement(  
                         "update `order` set id=?,iname=?, qty=? where id=?");  
            ps.setString(1,e.getId());  
            ps.setString(2,e.getName());  
            ps.setInt(3,e.getQty());  
             
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static List<Product> getAllProduct(){  
        List<Product> list=new ArrayList<Product>();  
          
        try{  
            Connection con=DBConnection2.initializeDatabase();  
            PreparedStatement ps=con.prepareStatement("select * from order");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
            	Product a=new Product();  
               a.setId(rs.getString(1));  
               a.setName(rs.getString(2));  
               a.setImanu(rs.getString(3));  
               a.setQty(rs.getInt(4));  
               
                list.add(a);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}
