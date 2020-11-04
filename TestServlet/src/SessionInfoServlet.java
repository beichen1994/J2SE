import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 			用于演示Servlet API中的Session管理机制
 */

public class SessionInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession mySession = req.getSession(true);
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();	
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Session Info Servlet</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h3>Session Information</h3>");
		pw.println("New Session:" + mySession.isNew());
		pw.println("<br>Session ID:"+mySession.getId());
		pw.println("<br> Session Creation Time:" + new java.util.Date(mySession.getCreationTime()));
		pw.println("<br> Session Last Accessed Time:"+ new java.util.Date(mySession.getLastAccessedTime()));		
		pw.println("<h3>Request Information</h3>");
		pw.println("Session ID from Request:" + req.getRequestedSessionId());
		pw.println("<br>Session ID via Cookie"+ req.isRequestedSessionIdFromCookie());
		pw.println("<br>Session ID via rewritten URL:" + req.isRequestedSessionIdFromURL());
		pw.println("<br> Valid Session ID:" + req.isRequestedSessionIdValid());
		pw.println("<br><a href=" + resp.encodeRedirectURL("SessionInfoServlet")+">refresh</a>");
		pw.println("</body></html>");
		pw.close();
	
	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
