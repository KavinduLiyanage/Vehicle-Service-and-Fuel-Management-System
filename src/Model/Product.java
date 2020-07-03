package Model;

public class Product {

	private String id;  
	  private String iname;
	  private String imanu;
	  private int qty;
	  public String getId() {  
	      return id;  
	  }  
	  public void setId(String id) {  
	      this.id = id;  
	  }  
	  public String getName() {  
	      return iname;  
	  }  
	  public void setName(String name) {  
	      this.iname = name;  
	  }  
	  
	  public String getImanu() {
		return imanu;
	  }
	  public void setImanu(String imanu) {
		this.imanu = imanu;
	  }
	  public int getQty() {  
	      return qty;  
	  }  
	  public void setQty(int qty) {  
	      this.qty = qty;  
	  }
}
