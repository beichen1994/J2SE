import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowCookies extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter pw = resp.getWriter();
		String title = "Active Cookies";
		pw.println("<html><head><title>获取客户端Cookie</title></head>"
				+"<body bgcolor =\"#FDF5E6\">\n"
				+"<h1 align =\"center\">" +title+"</h1>\n"
				+"<table border=1 align =\"center\">\n"
				+"<tr bgcolor =\"#FFADOO\">\n"
				+"<th>Cookie Name\n"
				+"<th>Cookie Value");
		Cookie[] cook = req.getCookies();
		if(cook != null){
			Cookie cookie;
			for(int i=0;i<cook.length;i++){
				cookie =cook[i];
				pw.println("<tr>\n" 
						 +"<td>"+cookie.getName() +"</td>\n"
						 +"<td>" + cookie.getValue()+"</td></tr>\n"
						);
			}
		}
		
		pw.println("</table></body></html>");
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
