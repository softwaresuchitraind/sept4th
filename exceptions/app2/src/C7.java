class C7
{
	int test()
	{
		try
		{
			//several statements
		}
		catch (ArithmeticException ex)
		{
				
		}
		finally
		{
			return 40;
		}
		
		return 10;//never execute------every flow goes to finally return value getting finally itself
	
	}
}
/*
C7.java:18: error: unreachable statement
                return 10;
                ^
1 error
*/