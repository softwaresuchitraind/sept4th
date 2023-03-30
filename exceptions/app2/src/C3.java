class C3
{
	int test()
	{
		try
		{
			//several statements
			return 20;
			
		}
		catch (ArithmeticException ex)
		{
			return 10;	
		}
		finally
		{
		
		}
	
		return 40;
	}
}
/*
C3.java:20: error: unreachable statement
                return 40;
                ^
1 error

return 40 will never execute
*/