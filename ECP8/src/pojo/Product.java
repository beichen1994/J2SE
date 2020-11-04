package pojo;

public class Product {
	private int pid;
	private String pname;
	private String description;
	private int ptype;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPtype() {
		return ptype;
	}
	public void setPtype(int ptype) {
		this.ptype = ptype;
	}
	public Product(int pid, String pname, String description) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.description = description;
	}
	public Product() {
		
	}
	
	
	

}
