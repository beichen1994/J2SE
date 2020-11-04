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
			s[1]=s[0].substring(0,4)+"��"+s[0].substring(4,6)+"��"+s[0].substring(6,8)+"��"+s[0].substring(8,10)+"ʱ"+s[0].substring(10,12)+"��"+s[0].substring(12,14)+"��";
			Order o=new Order();
			o.setOid(rs.getLong(1));
			s[2]=""+o.getTotalByOid();
			if(rs.getBoolean(3)){
				s[3]="�Ѹ���";
			}
			else{
				s[3]="δ����";
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
