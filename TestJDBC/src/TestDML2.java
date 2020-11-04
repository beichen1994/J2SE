import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestDML2 {
	public static void main(String[] args)  {
		if(args.length != 3){
			System.out.println("Parameter Error! Please input again!");
			System.exit(-1);
		}
		
		int deptno = 0;
		deptno = Integer.parseInt(args[0]);
		
		String dname = args[1];
		String loc = args[2];
		
		Connection conn =null;
		Statement stmt = null;

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1","scott","tiger");
			stmt = conn.createStatement();
			String sql = "insert into dept2 values("+deptno + ",'" + dname+"','" + loc +"')";
			stmt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
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
