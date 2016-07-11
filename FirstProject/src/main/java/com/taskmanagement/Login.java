package com.taskmanagement;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Login logic
		String username = req.getParameter("username").toString();
		String password = req.getParameter("password").toString();

		if (!"andrada".equals(username) || !"0000".equals(password)) {
			// not correct
			// go back to login
			doGet(req, resp);
		} else {
			// correct! Greet!
		
			req.setAttribute("username", username);
			req.getRequestDispatcher("/Greeting").forward(req, resp);
			
			
			
			
			// http://mrbool.com/how-to-create-a-login-form-with-jsp/25685
			// http://www.c-sharpcorner.com/uploadfile/satyapriyanayak/working-with-hibernate-display-insert-update-and-delete-in-java/
		}
	}

}
