package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet5 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String s1 =request.getParameter("firstName");
		String s2 =request.getParameter("gender");
		String s3 =request.getParameter("skill");
		String s4 =request.getParameter("education");
		response.setContentType("text/html");
		
		out.println("<table border='1'>");
		out.println("<tr><td>First Name</td><td>" + s1 +"</td></tr>");
		out.println("<tr><td>Gender</td><td>" + s2 +"</td></tr>");
		out.println("<tr><td>Skill</td><td>" + s3 +"</td></tr>");
		out.println("<tr><td>Education</td><td>" + s4 +"</td></tr>");

		out.println("</table>");
		
	}
}