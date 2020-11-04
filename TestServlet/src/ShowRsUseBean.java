import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class ShowRsUseBean extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("gb2312");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<table border = 1>");
		pw.println("<tr><td>Content:</td></tr>");
		
		Connection conn = DB.getConn();
		Statement stmt = DB.getStmt(conn);
		ResultSet rs = DB.getRs(stmt, "select * from customer");
		
		try {
			while(rs.next()){
				pw.println("<tr>");
				pw.println("<td>"+rs.getString("cont")+"</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DB.close(rs);
		DB.close(conn);
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
