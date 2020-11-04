package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.Customer;
import pojo.Seller;

public class AccountSerlvet22 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AccountSerlvet22() {
		super();
	}
	
	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        int account=Integer.parseInt(request.getParameter("account"));
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		switch (account) {
		case 1:
			Customer c=new Customer();
			c.setCid(id);
			c.setPassword(password);
			if(c.login()){
				HttpSession session=request.getSession();
				session.setAttribute("customer", c);
				response.sendRedirect("ProductServlet");
			}
			else{
				response.sendRedirect("login.jsp");
			}
			break;
		case 2:
			Seller s=new Seller();
			s.setSid(id);
			s.setPassword(password);
			if(s.login()){
				HttpSession session=request.getSession();
				session.setAttribute("seller", s);
				response.sendRedirect("StoreServlet");
			}
			else{
				response.sendRedirect("login.jsp");
			}
			break;
		default:
			break;
		}		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
