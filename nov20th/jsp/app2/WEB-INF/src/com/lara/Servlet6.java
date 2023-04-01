package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Arrays;

public class Servlet6 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String[] s1 =request.getParameterValues("firstName");
		String[] s2 =request.getParameterValues("gender");
		String[] s3 =request.getParameterValues("skill");
		String[] s4 =request.getParameterValues("education");
		response.setContentType("text/html");
		
		out.println("<table border='1'>");
		out.println("<tr><td>First Name</td><td>" + Arrays.toString(s1) +"</td></tr>");
		out.println("<tr><td>Gender</td><td>" + Arrays.toString(s2) +"</td></tr>");
		out.println("<tr><td>Skill</td><td>" + Arrays.toString(s3) +"</td></tr>");
		out.println("<tr><td>Education</td><td>" + Arrays.toString(s4) +"</td></tr>");

		out.println("</table>");
		
	}
}