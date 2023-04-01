package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Arrays;

public class Servlet9 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		Enumeration names = request.getParameterNames();
		String name,values[];
		while(names.hasMoreElements())
		{
			name =(String)names.nextElement();
			values=request.getParameterValues(name);
			out.println(name+ ":"+Arrays.toString(values) + "<br/>");
			
		}
		
	
		
	}
}
/*

*/