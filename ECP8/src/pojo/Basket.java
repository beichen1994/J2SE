package pojo;

import db.DBHelper;

public class Basket {
private int cid,pid,sid,quantity;

public Basket(int cid, int pid, int sid, int quantity) {
	super();
	this.cid = cid;
	this.pid = pid;
	this.sid = sid;
	this.quantity = quantity;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}

public Basket(){
	
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void addBasket(){
	String sql="insert into basket values("+cid+","+pid+","+sid+","+quantity+");";
	DBHelper.executeUpdate(sql);
	DBHelper.closeConnection();
}
}
