package pojo;

import java.sql.ResultSet;

import db.DBHelper;

public class Customer {
private int cid;
private String cname,password;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Customer(int cid, String cname, String password) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.password = password;
}
public Customer(){
	
}
public boolean login(){
	String sql="select * from customer where cid='"+this.cid +"' and password='"+this.password+"';";
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
public void addCustomer() {
	// TODO Auto-generated method stub
	String sql="insert into customer values("+cid+",?,?);";
	DBHelper.executeUpdate(sql,cname,password);
	DBHelper.closeConnection();
}
}
