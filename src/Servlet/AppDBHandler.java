package Servlet;

import java.sql.*;
import java.util.*;

import Model.*;

public class AppDBHandler {

	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicleservicedb", "root", "root");
        
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int AddApp(Appointment a){  
        int status=0;  
        try{  
            Connection con=AppDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into Appointment(VehicleYear, VehicleType, AppointmentDate, TimeFrame, SelectedServices, Name, Email, ContactNo, QuestionComments) values (?,?,?,?,?,?,?,?,?)");  
            ps.setString(1,a.getVehicleYear()); 
            ps.setString(2,a.getVehicleType()); 
            ps.setString(3,a.getAppointmentDate());
            ps.setString(4,a.getTimeFrame());
            ps.setString(5,a.getServiceType());
            ps.setString(6,a.getName());
            ps.setString(7,a.getEmail());
            ps.setString(8,a.getContactNumber());
            ps.setString(9,a.getQuestionsandComments());
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static int update2(Appointment a){  
        int status=0;  
        try{  
            Connection con=AppDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update appointment set VehicleYear=?,VehicleType=?,AppointmentDate=?,TimeFrame=?,Name=?,Email=?,ContactNo=? where AppointmentID=?");  
            ps.setString(1,a.getVehicleYear()); 
            ps.setString(2,a.getVehicleType()); 
            ps.setString(3,a.getAppointmentDate());
            ps.setString(4,a.getTimeFrame());
            ps.setString(5,a.getName());
            ps.setString(6,a.getEmail());
            ps.setString(7,a.getContactNumber());
            ps.setInt(8,a.getId());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
    
    
    public static int delete(int AppointmentID){  
        int status=0;  
        try{  
            Connection con=AppDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from appointment where AppointmentID=?");  
            ps.setInt(1,AppointmentID);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    
    
    public static Appointment getAppointmentById(int id){  
        Appointment a=new Appointment();  
          
        try{  
            Connection con=AppDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select AppointmentID, VehicleYear, VehicleType, AppointmentDate, TimeFrame,SelectedServices, Name, Email, ContactNo, QuestionComments from appointment where AppointmentID=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){ 
                a.setId(rs.getInt(1));  
                a.setVehicleYear(rs.getString(2));  
                a.setVehicleType(rs.getString(3));  
                a.setAppointmentDate(rs.getString(4));  
                a.setTimeFrame(rs.getString(5));
                a.setServiceType(rs.getString(6));
                a.setName(rs.getString(7));
                a.setEmail(rs.getString(8));
                a.setContactNumber(rs.getString(9));
                a.setQuestionsandComments(rs.getString(10));
    
            }  
            con.close();  
       }catch(Exception ex){ex.printStackTrace();}  
          
           return a;  
    } 
    
    
    public static List<Appointment> getAllAppointments(){  
        List<Appointment> list=new ArrayList<Appointment>();  
          
        try{  
            Connection con=AppDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from appointment");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
               Appointment a=new Appointment();  
               a.setId(rs.getInt(1));  
               a.setVehicleYear(rs.getString(2));  
               a.setVehicleType(rs.getString(3));  
               a.setAppointmentDate(rs.getString(4));  
               a.setTimeFrame(rs.getString(5));
               a.setServiceType(rs.getString(6));
               a.setName(rs.getString(7));
               a.setEmail(rs.getString(8));
               a.setContactNumber(rs.getString(9));
               a.setQuestionsandComments(rs.getString(10));
                list.add(a);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}
