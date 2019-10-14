/**
 * Copyright(C) 2019 Luvina Software Company
 * LoginServlet.java Oct 14, 2019 nthoai
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * LoginServlet
 * @author nthoai
 *
 */
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Thực hiện lấy dữ liệu từ form, kiểm tra và trả về response dưới dạng HTML
	 * @param request Dùng để truy xuất cookie, các thuộc tính và các thông tin khác của yêu cầu.
	 * @param response Dùng để gửi một response đến browser
	 * @throws ServletException, IOException
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Uname = request.getParameter("username"); 
		String Upass = request.getParameter("password"); 
		String result = "";
	    if(Uname.equals("Luvina") && Upass.equals("Luvina")) {  
	    	result = "Welcome!";  
	    }  else {  
	    	result = "Invalid username or password";
		}  
		out.println("<html><head><title>Login Servlet</title></head><body>");
		out.println("<h1>" + result + "</h1>");
		out.println("</body></html>");
		out.close();

	}
	
	/**
	 * Gọi phương thức doGet
	 * @param request Dùng để truy xuất cookie, các thuộc tính và các thông tin khác của yêu cầu.
	 * @param response Dùng để gửi một response đến browser
	 * @throws ServletException, IOException
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
