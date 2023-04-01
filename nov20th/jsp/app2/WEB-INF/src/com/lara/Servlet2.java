package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet2 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String s1 =request.getParameter("param1");
		String s2 =request.getParameter("param2");
		out.println("Param1 Value"+ s1);
		out.println("/br");
		out.println("Param2 Value"+ s2);
	}
}
/*
http://localhost:7070/app2/s2
param1 value =null
param2 value =null

http://localhost:7070/app2/s2?param1=abc

param1 value =abc
param2 value =null

http://localhost:7070/app2/s2?param2=123

param1 value =null
param2 value =123
*/