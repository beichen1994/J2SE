import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
	
	public static Connection getConn(){
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/ecp?user=root & password = root");
		}catch(ClassNotFoundException e ){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public static Statement getStmt(Connection conn){
		Statement stmt = null;
		try{
			if(conn != null){
				stmt = conn.createStatement();
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	
	public static ResultSet getRs (Statement stmt,String sql){
		ResultSet rs = null;
		
		try {
			if(stmt != null){
			rs = stmt.executeQuery(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	
	public static void close(Connection conn){
		
			try {
				
				if(conn != null){
				conn.close();
				conn =null;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
	}
	
	public static void close(Statement stmt){
		
		try {
			
			if(stmt != null){
			stmt.close();
			stmt =null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
}
	
	
	
	public static void close(ResultSet rs){
		
			try {
			
				if(rs != null){
				rs.close();
				rs =null;
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
	}
	
}
