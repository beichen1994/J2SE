package pojo;

import java.sql.ResultSet;

import db.DBHelper;

public class Seller {
	private int sid;
	private String sname,password;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Seller() {
		
	}
	public Seller(int sid, String sname,String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.password = password;
	}
	public void addSeller() {
		// TODO Auto-generated method stub
		String sql="insert into seller values("+sid+",?,?);";
		DBHelper.executeUpdate(sql,sname,password);
		DBHelper.closeConnection();
	}
	public boolean login(){
		String sql="select * from seller where sid='"+this.sid +"' and password='"+this.password+"';";
		try{
			ResultSet rs=DBHelper.executeQuery(sql);
			if(rs.next()){
				return true;
			}
			DBHelper.closeConnection();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	

}
