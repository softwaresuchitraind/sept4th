package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet10 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String s1 =getInitParameter("driver");//it is a inherited one HttpServlet
		//it is used for reading constraints
		out.println("something from Servlet10: "+s1);

	}
}
/*

*/