class O2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		System.out.println("try block");
		int i=Integer.parseInt("abc");
		System.out.println("1");
		}
		
		
	   catch (NumberFormatException ex)//Throwable
		{
			System.out.println(3);
		}
		System.out.println("2");

+
	}

}