
public class Servlet7 extends HttpServlet  
{
	public void service(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		String s1 = getInitParameter("con1");
		String s2
		System.out.println("Hello World!");
	}
}
//tomcat8.0\webapp\app2\web-inf\web.xml