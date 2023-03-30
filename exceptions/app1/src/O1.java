class O1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
		System.out.println("try block");
		String s1=null;
		int i=s1.length();
		System.out.println("1");
		}
		
		
	   catch (NullPointerException ex)//Throwable
		{
			System.out.println(3);
		}
		System.out.println("2");

	}

}

/*

*/