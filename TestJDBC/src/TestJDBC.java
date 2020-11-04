
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestJDBC {
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1","scott","tiger");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from dept");
		while(rs.next()){
			System.out.println(rs.getString("deptno"));
			System.out.println(rs.getInt("deptno"));
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}

}
