package com.lara;
public class Servlet10 extends HttpServlet  
{
	public void service(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		ServletContext context = getSetvletContext();
		Enumeration names = context.getInitParameterNames();
		String name,value;
		while(names.hasMoreElement())
		{
			name = (String)names.nextElement();
			value = context.getInitParameter(name);

		}
	}
}
//tomcat8.0\webapp\app2\web-inf\web.xml
//Tomcat 8.0\webapp\app2\WEB-INF\src\com\lara\Servlet9.java
//localhost:7070/app2/s10