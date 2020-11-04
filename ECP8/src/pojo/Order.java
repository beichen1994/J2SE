package pojo;

import java.sql.ResultSet;
import java.util.ArrayList;

import dao.BasketDao;
import db.DBHelper;

public class Order {
	private long oid;
	private int sid;
	private int cid;
	public Order(long oid, int sid, int cid) {
		super();
		this.oid = oid;
		this.sid = sid;
		this.cid = cid;
	}
	public Order() {
	
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void pay(){
		String sql="update ordera set pay=1 where oid="+oid+";";
		DBHelper.executeUpdate(sql);
		DBHelper.closeConnection();
	}
	public double getTotalByOid(){
		double total=0;
		String sql="select * from lineitem where oid="+oid+";";
		ResultSet rs=DBHelper.executeQuery(sql);
		try{
			while(rs.next()){
				LineItem l=new LineItem();
				l.setOid(rs.getLong(1));
				l.setPid(rs.getInt(2));
				l.setQuantity(rs.getInt(3));
				l.setSid(rs.getInt(4));
				total=total+l.getTotal();
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		BasketDao bd=new BasketDao();
		total=bd.getRealTotal(total);
		return total;
	}
	public ArrayList<String[]> getOrderDetail(){
		ArrayList<String[]> list=new ArrayList<String[]>();
		String sql="select product.pname,lineitem.quantity,stock.price,stock.discount from ordera,lineitem,product,stock where ordera.oid="+oid+" and ordera.oid=lineitem.oid and lineitem.pid=product.pid and stock.pid=lineitem.pid and stock.sid=lineitem.sid;";
		ResultSet rs=DBHelper.executeQuery(sql);
		try{
			while(rs.next()){
				String s[]=new String[3];
				s[0]=rs.getString(1);
				s[1]=""+rs.getInt(2);
				s[2]=""+rs.getDouble(3)*rs.getDouble(4);
				list.add(s);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		DBHelper.closeConnection();
		return list;
	}
	public int getOrderIsPay(){
		int pay=0;
		String sql="select * from ordera where oid="+oid+";";
		ResultSet rs=DBHelper.executeQuery(sql);
		try{
			if(rs.next()){
				if(rs.getInt(3)==1){
					pay=1;
				}
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		DBHelper.closeConnection();
		return pay;
	}
}
