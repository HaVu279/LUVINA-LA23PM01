/**
 * Copyright(C) 2019 Luvina Software Company
 * DBConnection.java Oct 11, 2019 nthoai
 */
package nguyenthihoai.controller;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nguyenthihoai.dao.UserDao;
import nguyenthihoai.entities.User;


/**
 * Servlet implementation class BookServletController
 */
@WebServlet("/ListUserServlet")
public class ListUserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	UserDao userDao = new UserDao();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			listUsers(request, response);
		} catch (Exception ex) {
			System.out.println(this.getClass().getName() + " - listUsers() - " + ex.getMessage());
		}
	}
	public void listUsers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		try {
			// get user from db util
			ArrayList<User> listUser = userDao.listUser();
			
			// send to JSP page (view)
			// add user to the request
			request.setAttribute("USER_LIST", listUser);
	
			// send to JSP page (view)
			RequestDispatcher dispatcher = request.getRequestDispatcher("/listUser_cach1.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			System.out.println(this.getClass().getName() + " - listUsers() - " + e.getMessage());
			throw e;
		} 
	}
}
