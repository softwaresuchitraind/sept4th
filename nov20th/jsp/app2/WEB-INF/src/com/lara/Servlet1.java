package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();//u will be get one print writer
		out.println("Hello World! through out");//send to brower
		System.out.println("Hello World! through sop");//printing in the log files
		out.println("Hello World! through out");//send to brower
		System.out.println("Hello World! through sop");//printing in the log files
	}
}
/*
-class should be public
-class should be subclass to HttpServlet
-form a servlet if u want to set any output to the browser we have to use out.println
cmd
F:\Tomcat8.0\webapps\app2\WEB-INF\src >javac -d ../classes com/lara/*.java
while modifing we have to compile
*/
