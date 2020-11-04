import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SetCookies extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		for(int i =0; i< 3;i++){
			Cookie co = new Cookie("Session-Cookie-" + i,"Cookie-Value-S" + i);
			co.setMaxAge(3600);
			resp.addCookie(co);
		}
		
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter pw  = resp.getWriter();
		String title ="Setting Cookies";
		pw.println("<html><head><>title>…Ë÷√cookie</title></head>"
				+ "<body bgcolor =\"#FGF5E6\">\n"
				+"<h aligh = \"center\">" +title +"</h1>\n"
				+"there are six cookies associated with this page.\n"
				+"to see them,visit the \n"+"<a href = \"ShowCookies\">\n"
				+"<code>ShowCookies</code>servlet</a>.\n"
				+"<p>\n"
				+"three of the cookies are associated only with the\n"
				+"current session,while three are persistent.\n"
				+"quit the browser,restart,and return to the \n"
				+"<code>ShowCookies</code> servlet to verify that\n"
				+"the three long-lived ones persist across sessions.\n"
				+"</body></html>"
				
				);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
