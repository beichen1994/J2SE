package pojo;

import java.sql.ResultSet;

import db.DBHelper;

public class LineItem {
	private long oid;
	private int pid;
	private int quantity;
	private int sid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
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
	
	public void addLineItem(){
		String sql="insert into lineitem values("+oid+","+pid+","+quantity+","+sid+");";
		DBHelper.executeUpdate(sql);
		DBHelper.closeConnection();
	}
	public double getTotal(){
		double total=0;
		String sql="select * from lineitem,stock where oid="+oid+" and lineitem.pid="+pid+" and lineitem.pid=stock.pid and lineitem.sid=stock.sid;";
		ResultSet rs=DBHelper.executeQuery(sql);
		try{
			if(rs.next()){
				total=rs.getDouble(8)*rs.getInt(3)*rs.getDouble(9);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		DBHelper.closeConnection();
		return total;
	}

}
