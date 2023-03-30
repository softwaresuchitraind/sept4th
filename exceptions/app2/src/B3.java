class B3
{
	int test()
	{
		try
		{
			//several statements
			
		}
		catch (ArithmeticException ex)
		{
			return 20;
		}
	
	}
}
/*
B3.java:15: error: missing return statement
        }
        ^
1 error
-- if try executed successfullly
*/