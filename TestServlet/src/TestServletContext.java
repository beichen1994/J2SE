import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServletContext extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter pw = resp.getWriter();
		
		ServletContext application = this.getServletContext();
		
		Integer accessCount = (Integer) application.getAttribute("accessCount");
		if(accessCount == null){
			accessCount = new Integer(0);
			
		}else{
			accessCount = new Integer(accessCount.intValue()+1);
		}
		
		application.setAttribute("accessCount", accessCount);
		
		pw.println("<html><head><title>Session×·×Ù</title></head>"
				+"<body bgcolor =\"#FDF5E6\">\n"
				+"<h1 align=\"center\">"+accessCount+"\n"
				+"</table>\n"
				+"</body></html>"
				+"</h1>\n"
				);
	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
