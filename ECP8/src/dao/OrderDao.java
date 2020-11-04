package dao;
import java.sql.ResultSet;
import java.util.ArrayList;

import pojo.Order;

import db.DBHelper;


public class OrderDao {
public ArrayList<String[]> getAllOrderByCid(int cid){
	ArrayList<String[]> list=new ArrayList<String[]>();
	String sql="select * from ordera where cid="+cid+";";
	ResultSet rs=DBHelper.executeQuery(sql);
	try{
		while(rs.next()){
			String s[]=new String[4];
			s[0]=rs.getString(1);
			s[1]=s[0].substring(0,4)+"年"+s[0].substring(4,6)+"月"+s[0].substring(6,8)+"日"+s[0].substring(8,10)+"时"+s[0].substring(10,12)+"分"+s[0].substring(12,14)+"秒";
			Order o=new Order();
			o.setOid(rs.getLong(1));
			s[2]=""+o.getTotalByOid();
			if(rs.getBoolean(3)){
				s[3]="已付款";
			}
			else{
				s[3]="未付款";
			}
			list.add(s);
		}
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	DBHelper.closeConnection();
	return list;
}
}
