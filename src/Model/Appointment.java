package Model;

public class Appointment {
	
	//Create variable
	 private int id;
	 private String no;
	 private String year;  
	 private String name,email,questionComment,type,time;
	 private String date;
	 private String ServiceType;
	 
	 //get and set id
	 public int getId() {  
	     return id;  
	 }  
	 public void setId(int id) {  
	     this.id = id;  
	 } 
	 
	 //get and set year
	 public String getVehicleYear() {
		 return year;
	 }
	 public void setVehicleYear(String year) {
		this.year = year;
	 }
	 
	 //get and set type
	 public String getVehicleType() {
		return type;
	 }
	 public void setVehicleType(String type) {
		this.type = type;
	 }
	 
	 //get and set date
	 public String getAppointmentDate() {
		return date;
	 }
	 public void setAppointmentDate(String date) {
		this.date = date;
	 }
	
	 //get and set time
	 public String getTimeFrame() {
		return time;
	 }
	 public void setTimeFrame(String time) {
		this.time = time;
	 }
	 
	 //get services
	 public String getServiceType() {
		return ServiceType;
	}
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	
	//get and set name
	 public String getName() {  
	     return name;  
	 }  
	 public void setName(String name) {  
	     this.name = name;  
	 }
	 
	 //get and set email
	 public String getEmail() {  
	     return email;  
	 }  
	 public void setEmail(String email) {  
	     this.email = email;  
	 } 
	 
	 //get and set no
	 public String getContactNumber() {
		 return no;
	 }
	 public void setContactNumber(String no) {
		 this.no = no;
	 }
	 
	 //get and set questionComments
	 public String getQuestionsandComments() {
		 return questionComment;
	 }
	 public void setQuestionsandComments(String questionComment) {
		 this.questionComment = questionComment;
	 }

	 
	 
}
