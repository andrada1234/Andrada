package com.taskmanagement;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet{

	/**
	 * Generated serial id
	 */
	private static final long serialVersionUID = -703980434469498486L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	   req.setAttribute("username", req.getParameter("username"));
	    req.getRequestDispatcher("/Logout").forward(req, resp);
		req.getRequestDispatcher("/jsp/Logout.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		
	}
}
