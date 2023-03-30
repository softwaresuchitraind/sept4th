
public class Servlet9 extends HttpServlet  
{
	public void service(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		ServletContext context = getSetvletContext();
		String s1 = context.getInitParameter("p1");
		String s2 =context.getInitParameter("url");
		out.println("p1 :" +s1);
		out.println("url :" +s2);
	}
}
//tomcat8.0\webapp\app2\web-inf\web.xml
//Tomcat 8.0\webapp\app2\WEB-INF\src\com\lara\Servlet9.java
//