package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet4 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String s1 =request.getParameter("username");
		String s2 =request.getParameter("password");
		response.setContentType("text/html");
		if("abc".equals(s1) && "xyz".equals(s2))
		{
			out.println("Login success");
		}
		else
		{
			out.println("Login Failed");
		}
		out.println("<br/><a href='test6.html'>play Again</a>");
		
	}
}