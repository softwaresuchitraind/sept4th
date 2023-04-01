package com.lara;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet8 extends HttpServlet  
{
	public void service(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		String queryString = request.getQueryString();
		out.println("from queryString:"+ queryString);
		response.setContentType("text/html");
		String[] params =queryString.split("&");
		String name,value;
		int index;

		for(String param :params)
		{
			index = param.indexOf('=');
			name = param.substring(0,index);
			value = param.substring(index+1);
			out.println("<br/>" + name + ":"+ value);
		}
		
	
		
	}
}
/*

*/