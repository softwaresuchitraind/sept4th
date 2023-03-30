class C4
{
	int test()
	{
		try
		{
			//several statements
			return 20;//go to finally
			
		}
		catch (ArithmeticException ex)
		{
			return 10;	
		}
		finally
		{
			return 40;// 20 getting replaced with 40---if catch executes 10 is replaced by 40
		}
	
	
	}
}

/*
cs

*/