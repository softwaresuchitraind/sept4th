class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			return;
		}
		try
		{
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
	
		catch (ArithmeticException ex)
		{
				System.out.println(3);
		}
		finally
		{
			System.out.println("from finally");
		}
			
		
		System.out.println("main end");//not getting
	}
}

/*
G:\nov20th\exception\app1\src>java -cp ../classes Z11
main begin


-If something is happening before try then finally is not
guarenteed to execute.

*/