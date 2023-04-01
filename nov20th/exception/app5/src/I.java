class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try(H h1 = new H())
		{
			System.out.println("from try");	
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
						
			System.out.println("from finally");	

		}
			System.out.println("main end");	

	}
}

/*
once try block complectly got over calling close() of H

someconditions
..............
-Only closable resources can be opened in the paranthesis of try
-h1 should not be reiniitialised in the body of try it is acting as final

*/