package dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import pojo.Basket;
import pojo.LineItem;
import pojo.Strategy;

import db.DBHelper;

public class BasketDao {
public ArrayList<String[]> showBasketByCid(int cid){
	ArrayList<String[]> l=new ArrayList<String[]>();
	String sql="select cid,basket.pid,basket.sid,basket.quantity,product.pid,pname,description,stock.sid,stock.pid,stock.quantity,price,discount,seller.sid,sname from basket,product,stock,seller where basket.cid="+cid+" and basket.pid=product.pid and basket.sid=stock.sid and product.pid=stock.pid and stock.sid=seller.sid;";
	try{
		ResultSet rs=DBHelper.executeQuery(sql);
		while(rs.next()){
			String s[]=new String[4];
			s[0]=""+rs.getInt(4);
			s[1]=rs.getString(6);
			s[2]=""+rs.getDouble(11)*rs.getDouble(12);
			s[3]=rs.getString(14);
			l.add(s);
		}
		DBHelper.closeConnection();
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	return l;
}
public ArrayList<Basket> getAllBasketByCid(int cid){
	ArrayList<Basket> b=new ArrayList<Basket>();
	String sql="select cid,pid,sid,quantity from basket where cid="+cid+";";
	ResultSet rs=DBHelper.executeQuery(sql);
	try{
		while(rs.next()){
			Basket ba=new Basket();
			ba.setCid(rs.getInt(1));
			ba.setPid(rs.getInt(2));
			ba.setSid(rs.getInt(3));
			ba.setQuantity(rs.getInt(4));
			b.add(ba);
		}
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	return b;
}
public long clearBasket(int cid){
	Date now = new Date(); 
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	String oid = dateFormat.format( now );
	oid=oid+cid;
	long oid1=Long.parseLong(oid);
	String sql1="INSERT INTO ordera VALUES("+oid1+","+cid+","+0+");";
	DBHelper.executeUpdate(sql1);
	DBHelper.closeConnection();
	ArrayList<Basket> blist=getAllBasketByCid(cid);
	for(Basket b : blist){
		LineItem li=new LineItem();
		li.setOid(oid1);
		li.setPid(b.getPid());
		li.setQuantity(b.getQuantity());
		li.setSid(b.getSid());
		li.addLineItem();
	}
	String sql2="delete from basket where cid="+cid+";";
	DBHelper.executeUpdate(sql2);
	DBHelper.closeConnection();
	return oid1;
}
public double getTotalByCid(int cid){
	double total=0;
	String sql="select cid,basket.pid,basket.sid,basket.quantity,stock.sid,stock.pid,stock.quantity,price,discount from basket,stock where cid="+cid+" and basket.pid=stock.pid and basket.sid=stock.sid;";
	ResultSet rs=DBHelper.executeQuery(sql);
	try{
		while(rs.next()){
			total=total+rs.getInt(4)*rs.getDouble(8)*rs.getDouble(9);//数量、价格、折扣
		}
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	DBHelper.closeConnection();
	return total;
}
public double getRealTotal(double total){
	Strategy str=new Strategy();
	int aa[]=str.getStrategyDetail();
	int enough=aa[0],reduce=aa[1];
	int a=(int)(total/enough);
	BigDecimal a2 = new BigDecimal(Double.toString(total));  
	BigDecimal b2 = new BigDecimal(Double.toString(a*reduce));  
	return a2.subtract(b2).doubleValue();
}
}
