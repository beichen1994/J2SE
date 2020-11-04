import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestJDBC2 {
	public static void main(String[] args)  {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1","scott","tiger");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from dept");
		while(rs.next()){
			System.out.println(rs.getString("deptno"));
			System.out.println(rs.getInt("deptno"));
		}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null){
					rs.close();
					rs = null;
				}
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
				if(conn != null){
					conn.close();
					conn =null;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
