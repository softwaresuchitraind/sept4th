package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet3 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String s1 =request.getParameter("firstName");
		String s2 =request.getParameter("lastName");
		String s3 =request.getParameter("age");
		String s4 =request.getParameter("email");
		response.setContentType("text/html");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td>First Name</td>");
		out.println("<td>" +s1+ "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Last Name</td>");
		out.println("<td>" +s2+ "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Age</td>");
		out.println("<td>" +s3+ "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Email</td>");
		out.println("<td>" +s4+ "</td>");
		out.println("</tr>");
		out.println("</table>");
		
	}
}