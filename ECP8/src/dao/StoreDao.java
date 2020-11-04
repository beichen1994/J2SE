package dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import db.DBHelper;

public class StoreDao {
	public ArrayList<String[]> showStoreBySid(int sid){
		ArrayList<String[]> l=new ArrayList<String[]>();
		String sql="select product.pname,product.description,stock.quantity,stock.price from product,stock,seller where seller.sid='"+sid+"' and stock.sid=seller.sid and stock.pid=product.pid;";
		try{
			ResultSet rs=DBHelper.executeQuery(sql);
			while(rs.next()){
				String s[]=new String[4];
				s[0]=rs.getString(1);
				s[1]=rs.getString(2);
				s[2]=""+rs.getInt(3);
				s[3]=rs.getString(4);
				l.add(s);
			}
			DBHelper.closeConnection();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return l;
	}
}
