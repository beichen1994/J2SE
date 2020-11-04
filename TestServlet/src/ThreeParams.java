import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ThreeParams extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		
		PrintWriter pw = resp.getWriter();
		pw.println(req.getParameter("param1"));
		pw.println(req.getParameter("<br/>"));
		pw.println(req.getParameter("param2"));
		pw.println(req.getParameter("<br/>"));
		pw.println(req.getParameter("param3"));
		pw.println(req.getParameter("br/"));
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
