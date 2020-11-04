package db;
import java.sql.*;

public class DBHelper {
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://127.0.0.1:3306/ecp4?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private static String user="root",pwd="root";
	private static Connection con;
	static{
		try{
			Class.forName(driver);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static void executeUpdate(String sql){
		try{
			con=DriverManager.getConnection(url, user, pwd);
			Statement cmd=con.createStatement();
			cmd.executeUpdate(sql);
			con.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static ResultSet executeQuery(String sql){
		ResultSet rs=null;
		try{
			con = DriverManager.getConnection(url, user, pwd);
			Statement cmd = con.createStatement();
			rs = cmd.executeQuery(sql);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return rs;
	}
	public static void closeConnection(){
		try{
			if(!con.isClosed())
				con.close();
			}catch(Exception ex){
				
			}
    }
	public static void executeUpdate(String sql,String name,String password){
		try{
			 
			con=DriverManager.getConnection(url, user, pwd);
			PreparedStatement pst=con.prepareStatement(sql);			
			pst.setString(1,name); 
			pst.setString(2,password); 
			pst.executeUpdate();
			con.close();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
