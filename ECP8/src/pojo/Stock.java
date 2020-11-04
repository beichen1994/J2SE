package pojo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import db.DBHelper;

public class Stock {
	private int sid;
	private int pid;
	private int quantity;
	public Stock(int sid, int pid, int quantity) {
		super();
		this.sid = sid;
		this.pid = pid;
		this.quantity = quantity;
	}
	public Stock() {


	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	
	public ArrayList<String[]> getAllProduct(){
		ArrayList<String[]> a=new ArrayList<String[]>();
		String sql="select stock.sid,stock.pid,quantity,price,pname,description,sname,discount from stock,product,seller where product.pid=stock.pid and stock.sid=seller.sid and quantity!=0;";
		try{
			ResultSet rs=DBHelper.executeQuery(sql);
			while(rs.next()){
				String i[]=new String[9];
				i[0]=""+rs.getInt(1);    //sid
				i[1]=""+rs.getInt(2);    //pid
				i[2]=""+rs.getInt(3);    //quantity
				i[3]=""+rs.getDouble(4); //price
				i[4]=rs.getString(5);    //pname
				i[5]=rs.getString(6);    //description
				i[6]=rs.getString(7);    //sname
				i[7]=""+rs.getDouble(8);  //discount
				i[8]=""+rs.getDouble(8)*rs.getDouble(4);//折后价格
				a.add(i);
			}
			DBHelper.closeConnection();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return a;
	}
	public ArrayList<String[]> getStoreProduct(int sid){
		ArrayList<String[]> a=new ArrayList<String[]>();
		String sql="select stock.sid,stock.pid,stock.quantity,stock.price,product.pname,product.description,seller.sname,product.type,discount from stock,product,seller where seller.sid='"+sid+"' and product.pid=stock.pid and stock.sid=seller.sid and quantity!=0;";
		try{
			ResultSet rs=DBHelper.executeQuery(sql);
			while(rs.next()){
				String i[]=new String[10];
				i[0]=""+rs.getInt(1); //sid
				i[1]=""+rs.getInt(2); //pid
				i[2]=""+rs.getInt(3); //quantity
				i[3]=""+rs.getDouble(4); //price
				i[4]=rs.getString(5); //pname
				i[5]=rs.getString(6);  //description
				i[6]=rs.getString(7); //sname
				i[7]=""+rs.getDouble(8);  //discount
				i[8]=""+rs.getDouble(8)*rs.getDouble(4);//折后价格
				i[9]=""+rs.getInt(8);  //type
				a.add(i);
			}
			DBHelper.closeConnection();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return a;
	}
	public ArrayList<String[]> getProductByType(int type){
		ArrayList<String[]> a=new ArrayList<String[]>();
		String sql="select stock.sid,stock.pid,stock.quantity,stock.price,product.pname,product.description,seller.sname,product.type,discount from stock,product,seller where product.pid=stock.pid and stock.sid=seller.sid and quantity!=0 and product.type='"+type+"';";
		try{
			ResultSet rs=DBHelper.executeQuery(sql);
			while(rs.next()){
				String i[]=new String[10];
				i[0]=""+rs.getInt(1); //sid
				i[1]=""+rs.getInt(2); //pid
				i[2]=""+rs.getInt(3); //quantity
				i[3]=""+rs.getDouble(4); //price
				i[4]=rs.getString(5); //pname
				i[5]=rs.getString(6); //description
				i[6]=rs.getString(7); //sname
				i[7]=""+rs.getDouble(9);  //discount
				i[8]=""+rs.getDouble(9)*rs.getDouble(4);//折后价格
				i[9]=""+rs.getInt(8);  //type
				a.add(i);
			}
			DBHelper.closeConnection();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return a;
	}

}
