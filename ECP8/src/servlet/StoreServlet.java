package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.Customer;
import pojo.Seller;
import pojo.Stock;

public class StoreServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StoreServlet() {
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
		HttpSession session=request.getSession();
		if(session.getAttribute("seller")!=null){
			Seller s=(Seller)session.getAttribute("seller");
		    Stock stock=new Stock();
		    ArrayList<String[]> a=new ArrayList<String[]>();
		    a=stock.getStoreProduct(s.getSid());
		    //HttpSession session=request.getSession();
		    session.setAttribute("storelist", a);
		    response.sendRedirect("store.jsp");
	   }//if
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
		HttpSession session=request.getSession();
		if(session.getAttribute("seller")!=null){
			Seller s=(Seller)session.getAttribute("seller");
		    Stock stock=new Stock();
		    ArrayList<String[]> a=new ArrayList<String[]>();
		    a=stock.getStoreProduct(s.getSid());
		    //HttpSession session=request.getSession();
		    session.setAttribute("storelist", a);
		    request.getRequestDispatcher("store.jsp");
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
