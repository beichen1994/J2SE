import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class TestPrepStmt {
  public static void main(String args[]){
	if(args.length != 3){
		System.out.println("Parameter Error! Please input again!");
		System.exit(-1);
	}
	
	int deptno = 0;
	deptno = Integer.parseInt(args[0]);
	
	String dname = args[1];
	String loc = args[2];
	
	Connection conn =null;
	PreparedStatement pstmt = null;

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1","scott","tiger");
		pstmt = conn.prepareStatement("insert int deptno values(?,?,?)");
		pstmt.setInt(1, deptno);
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);
		pstmt.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(pstmt != null){
				pstmt.close();
				pstmt = null;
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
