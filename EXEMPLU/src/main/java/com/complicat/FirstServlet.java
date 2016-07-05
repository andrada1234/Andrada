	package com.complicat;

	import java.io.IOException;
	import java.io.PrintWriter;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class FirstServlet extends HttpServlet{
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException{
			
					PrintWriter out = response.getWriter();
					response.setContentType("text/html");
		String title = "My Site-Serban Andrada-First Servlet";
		String docType = "<!DOCTYPE html>";
		out.println(docType
				+"<html>"
				+"<head><title>" + title + "</title></head>"
				+"<body>   "
				+"<h1>Hello World - "  +  title   +   "</h1>"
				+"<form method=GET action=secondservlet>   <hr>"
				+"<label>NAME : </label>    <input type=text name=name>  <br> <br>"
				+"<label>FORNAME : </label>    <input type=text name=forname>  <br> <br>"
				+"<label>PASSWORD : </label>    <input type=password name=password>  <br> <br>"
				+"<input type=submit value=Submit />" 
				+"<hr>"
				+"</body>"
				+"</html>");
		out.close();
		}		
	}
			