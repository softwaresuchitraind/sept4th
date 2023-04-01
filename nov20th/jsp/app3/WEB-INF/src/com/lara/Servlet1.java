package com.lara;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet 
{
	public Servlet1()
	{
		System.out.println("Servlet1()");
	}
	/*
	public void init(ServletConfig config)
		throws ServletException
	{
		super.init(config);//u have to provide super class init()
		System.out.println("Servlet1-init(config)");
	}
	*/

	public void init()
	{
		System.out.println("Servlet1-init()");
	}
	public void service(HttpServletRequest r1,HttpServletResponse r2)
		throws ServletException,IOException
	{
		PrintWriter out = r2.getWriter();
		ServletContext c1 = getServletContext();
		out.println("check in the log files" + c1);
		System.out.println("Servlet1-service");
	}
	public void destroy()
	{
		System.out.println("Servlet1-destory");
	}
	
}
