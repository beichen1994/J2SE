package pojo;

import java.sql.ResultSet;

import db.DBHelper;

public class Strategy {
	public String getSlogen(){
		String slogen="";
		String sql="select slogen from strategy;";
		ResultSet rs=DBHelper.executeQuery(sql);
		try{
			if(rs.next()){
				slogen=rs.getString(1);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		DBHelper.closeConnection();
		return slogen;
	}
	
	public int[] getStrategyDetail(){
		int a[]=new int[2];
		String sql="select enough,reduce from strategy;";
		ResultSet rs=DBHelper.executeQuery(sql);
		try{
			if(rs.next()){
				a[0]=rs.getInt(1);
				a[1]=rs.getInt(2);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		DBHelper.closeConnection();
		return a;
	}
	
	public void changeStrategy(int enough,int reduce,String slogen){
		String sql1="update strategy set enough="+enough+";";
		String sql2="update strategy set reduce="+reduce+";";
		String sql3="update strategy set slogen='"+slogen+"';";
		DBHelper.executeUpdate(sql1);
		DBHelper.executeUpdate(sql2);
		DBHelper.executeUpdate(sql3);
		DBHelper.closeConnection();
	}
	
}
