import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class TestBatch {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.1","scott","tiger");
		
		Statement stmt = conn.createStatement();
		stmt.addBatch("insert into values(51,'500','gaga')");
		stmt.addBatch("insert into values(51,'500','gaga')");
		stmt.addBatch("insert into values(51,'500','gaga')");
		stmt.executeBatch();
		stmt.close();
		
		PreparedStatement ps = conn.prepareStatement("insert into dept2 values(?,?,?)");
		ps.setInt(1, 61);
		ps.setString(2, "haha");
		ps.setString(3, "bj");
		ps.addBatch();
		
		ps.setInt(1, 61);
		ps.setString(2, "haha");
		ps.setString(3, "bj");
		ps.addBatch();
	
		ps.executeBatch();
		ps.close();
		
		conn.close();
	}

}
