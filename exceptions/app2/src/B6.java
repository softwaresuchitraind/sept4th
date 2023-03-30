class B6
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
			return 30;
		}
			return 40;
	
	
	}
}
/*
B6.java:15: error: unreachable statement
                        return 40;
                        ^
1 error


there is no chance of executing return 40
*/