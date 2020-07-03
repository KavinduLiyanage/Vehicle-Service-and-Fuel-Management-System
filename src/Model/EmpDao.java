package Model;


import java.util.*;  

import java.sql.*;  

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpDao {
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleservicedb","root","root");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into employee(name,password,address,contactNumber,email,gender,designation,branch) values (?,?,?,?,?,?,?,?)");  
          
            ps.setString(1,e.getName()); 
            ps.setString(2,e.getPassword());
            ps.setString(3,e.getAddress()); 
            ps.setString(4,e.getContactNumber());
            ps.setString(5,e.getEmail()); 
            ps.setString(6,e.getGender());
            ps.setString(7,e.getDesignation());
            ps.setString(8,e.getBranch());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }
    
    ///////////////////////Update///////////////////////
    
    public static int update(Emp e){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update employee set name=?,password=?,address=?,contactNumber=?,email=?,gender=?,designation=?,branch=? where EmpId=?");  
            
            ps.setString(1,e.getName()); 
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getAddress()); 
            ps.setString(4,e.getContactNumber());
            ps.setString(5,e.getEmail()); 
            ps.setString(6,e.getGender());
            ps.setString(7,e.getDesignation());
            ps.setString(8,e.getBranch());  
            ps.setInt(9,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
   
    ///////////////////////////Delete////////////////////
    
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from employee where EmpID=?");
            ps.setInt(1,id);  
            status=ps.executeUpdate();
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
    ////////////////////////////Get Employee/////////
    
    public static Emp getEmployeeById(int id){  
        Emp e=new Emp();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee where EmpID=?");
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setAddress(rs.getString(4));  
                e.setContactNumber(rs.getString(5));  
                e.setEmail(rs.getString(6)); 
                e.setGender(rs.getString(7));
                e.setDesignation(rs.getString(8)); 
                e.setBranch(rs.getString(9)); 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    
    ////////////////////////Array List/////////////////////////
    
    public static List<Emp> getAllEmployees(){  
        List<Emp> list=new ArrayList<Emp>();  
          
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3)); 
                e.setAddress(rs.getString(4));  
                e.setContactNumber(rs.getString(5));  
                e.setEmail(rs.getString(6));
                e.setGender(rs.getString(7));
                e.setDesignation(rs.getString(8)); 
                e.setBranch(rs.getString(9));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    
}
