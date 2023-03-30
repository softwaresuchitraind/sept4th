public class  Sevlet2
{
	public static void main(String[] args) 
	{
		Enumeration<String> names = context.getInitParameterNames();
		String name, value;
		while(names.hasMoreElements())
		{
			name = names.nextElement();
			value = context.getInitParameter(name);
			out.println(name + ":" +value);
		}
	}
}
