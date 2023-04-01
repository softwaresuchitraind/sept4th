public abstract class  GenericServlet implements Servlet,ServletConfig, Serializable
{
	private ServletConfig config;
	public void init(ServletConfig config)
	{
		this.config = config;
		init(); 
	}
	public void init()
	{
	
	}
	public String getInitParameter(String name)
	{
		return conig.getInitParametr(name);
	}
		---------
		-------
		------
		------------
}
