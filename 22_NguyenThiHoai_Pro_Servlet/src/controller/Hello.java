/**
 * Copyright(C) 2019 Luvina Software Company
 * Hello.java Oct 14, 2019 nthoai
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * controller Hello
 * @author nthoai
 *
 */

public class Hello extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Thực thi và trả về response dưới dạng HTML
	 * @param request Dùng để truy xuất cookie, các thuộc tính và các thông tin khác của yêu cầu.
	 * @param response Dùng để gửi một response đến browser
	 * @throws ServletException, IOException
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Hello Servlet</title></head><body>");
		out.println("<h1>Hello Servlet</h1>");
		out.println("<p>Welcome to JSP course</p>");
		out.println("<a href='login.html'>Login</a>");
		out.println("</body></html>");
		out.close();
	}
	
	/**
	 * Gọi phương thức doGet
	 * @param request Dùng để truy xuất cookie, các thuộc tính và các thông tin khác của yêu cầu.
	 * @param response Dùng để gửi một response đến browser
	 * @throws ServletException, IOException
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doGet(request, response);
	}
}

