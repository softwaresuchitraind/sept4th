public class Servlet8   
{
	public void service(HttpServeltRequest request, HttpServletResponse response)
		throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		Enumeration names =getInitParameterNames();
		String name, value;
		while(names.hasMoreElement())
		{
			name=(String)names.nextElement		
		}
	}
}
