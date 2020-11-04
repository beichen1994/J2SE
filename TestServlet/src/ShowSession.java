import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Session×·×Ù

public class ShowSession extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/heml");
		PrintWriter pw = resp.getWriter();
		HttpSession sess = req.getSession(true);
		String title = "Session Tracking Example";
		String heading;
		
		Integer accessCount = (Integer) sess.getAttribute("accessCount");
		if(accessCount == null){
			accessCount = new Integer(0);
			heading = "Welcome Newcomer";
		}else{
			accessCount = new Integer(accessCount.intValue()+1);
			heading = "Welcome Back";
		}
		
		sess.setAttribute("accessCount", accessCount);
		
		pw.println("<html><head><title>Session×·×Ù</title></head>"
					+"<body bgcolor = \"#FDF5E6\">\n"
					+"<h1 align=\"center\">"+heading+"</h1>\n"
					+"<h2> information on your session:</h2>\n"
					+"<table border =1 align=\"center\">\n"
					+"<tr bgcolor =\"#FFADOO\">\n"
					+"<th> Info Type <th> Value\n"
					+"<tr>\n"+"<td>ID\n"+"<td>"+sess.getId()+"\n"
					+"<tr>\n"+"<td>Creation Time \n"+"<td>"+new Date(sess.getCreationTime())
					+"\n"+"<tr>\n"
					+"<td>Time of Last Access\n" +"<td>"+ new Date(sess.getLastAccessedTime())
					+"\n"+"<tr>\n"
					+"<td>Number of Previous Accesses\n" +"<td>"+ accessCount
					+"\n"+"</table>\n"+"</body></html>"
				);
	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
