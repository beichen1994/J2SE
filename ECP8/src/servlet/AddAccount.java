package servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import db.DBHelper;
import pojo.Customer;
import pojo.Seller;

public class AddAccount extends HttpServlet{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AddAccount() {
		super();
	}
    public void destroy() {
		super.destroy();
	}
    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	    int account=Integer.parseInt(request.getParameter("account"));
		    int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			String confirm_password=request.getParameter("confirm-password");
			if (account==1) {
				String sql="select cid from customer where cid='"+id+"';";
				ResultSet rs=DBHelper.executeQuery(sql);
				try {
					if(rs.next()){
						response.sendRedirect("register-false.jsp");
					}
					else if (password.equals(confirm_password)) {
						Customer c=new Customer(id,name,password);
						c.addCustomer();
						response.sendRedirect("register-successful.jsp");
					}	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(account==2){
				String sql="select sid from seller where sid='"+id+"';";
				ResultSet rs=DBHelper.executeQuery(sql);
				try {
					if(rs.next()){
						response.sendRedirect("register-false.jsp");
					}
					else if (password.equals(confirm_password)) {
						Seller s= new Seller(id,name,password);
						s.addSeller();
						response.sendRedirect("register-successful.jsp");
					}	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
    public void init() throws ServletException {
		// Put your code here
	}
}
