package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Arrays;
import java.util.Map;

public class Servlet7 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		Map params = request.getParameterMap();//it returns every parameter values and store in map object
		String[] s1 =(String[])params.get("firstName");
		String[] s2 =(String[])params.get("gender");
		String[] s3 =(String[])params.get("skill");
		String[] s4 =(String[])params.get("education");
		response.setContentType("text/html");
		
		out.println("<table border='1'>");
		out.println("<tr><td>First Name</td><td>" + Arrays.toString(s1) +"</td></tr>");
		out.println("<tr><td>Gender</td><td>" + Arrays.toString(s2) +"</td></tr>");
		out.println("<tr><td>Skill</td><td>" + Arrays.toString(s3) +"</td></tr>");
		out.println("<tr><td>Education</td><td>" + Arrays.toString(s4) +"</td></tr>");

		out.println("</table>");
		
	}
}
/*
inside map object stores key and value pairs.
*/