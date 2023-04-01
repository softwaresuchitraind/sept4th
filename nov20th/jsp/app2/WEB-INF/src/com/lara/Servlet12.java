package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet12 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();//it is a inherited method
		//for entire appication ServletContext is global
		//it contains global information 
		//for one application only one ServletContext
		String s1 =context.getInitParameter("driver");
		String s2 =context.getInitParameter("reduction");
		out.println("something from Servlet12: "+s1);
		out.println("something from Servlet12: "+s2);

	}
}
/*

*/