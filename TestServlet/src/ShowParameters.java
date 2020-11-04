import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 				Interface Enumeration<E>
 * 	
 * 		boolean	hasMoreElements()
				Tests if this enumeration contains more elements.
				
		E	nextElement()
			Returns the next element of this enumeration if this enumeration object has at least one more element to provide.
 *
 */

public class ShowParameters extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=gb2312");
		PrintWriter pw = resp.getWriter();
		String title = "Readign All Request Parameters";
		pw.println( "<html><head><title>读取所有参数</title></head>"
					+"<body bgcolor='#FDF5E6'>\n"
					+"<h1 align =center>"+"</h1>\n"
					+"<table border = 1 align = center>\n"
					+"<tr bgcolor = \"#FFADOO\">\n"
					+"<TH>Parameter Name <TH>Parameter Value(s)"
				);
		Enumeration paramNames = req.getParameterNames();
		while(paramNames.hasMoreElements()){
			String pN = (String)paramNames.nextElement();
			pw.print("<tr><td>"+pN+"\n<td>");
			String []paramValues = req.getParameterValues(pN);
			if(paramValues.length == 1){
				String pV = paramValues[0];
				if(pV.length() == 0){
					pw.println("<I> No Value");
				}else{
					pw.println(pV);
				}
			}else{
				pw.println("<ul>");
				for(int i =0;i < paramValues.length;i++){
					pw.println("<li>" + paramValues[i]);
				}
				pw.println("</ul>");
				
			}
		}
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}

}
