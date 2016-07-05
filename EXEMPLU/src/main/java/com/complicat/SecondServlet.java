	package com.complicat;

	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class SecondServlet extends HttpServlet{
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException{
			
					PrintWriter out = response.getWriter();
					response.setContentType("text/html");
					
		String title = "My Site-Serban Andrada-Second Servlet";
		String docType = "<!DOCTYPE html>";
		
		out.println(docType
				+"<html>"
				+"<head><title>" + title + "</title></head>"
				+"<body>   "
				+"<h1>Hello World - "  +  title   +   "</h1>"
				+"<form method=GET action=secondservlet>   <hr>"
				+"<label>Your Name : </label>" + request.getParameter("name") + "<br>"
				+"<label>Your Forname : </label>" + request.getParameter("forname") + "<br>"
				+"<button>submit </button>"
				
				
				+"<hr>"
				+"</body>"
				+"</html>");
		out.close();
		}		
	}
			