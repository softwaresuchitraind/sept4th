class C5
{
	int test()
	{
		try
		{
			//several statements
		}
		catch (ArithmeticException ex)
		{
			return 10;	
		}
		finally
		{
			return 40;
		}
	
	
	}
}

/*
cs
if try executed successfully it goes to finally return 40
*/