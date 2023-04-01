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
G:\nov20th\exception\app2\src>javac -d ../classes C3.java
C3.java:18: error: unreachable statement
                return 40;
                ^
1 error

*/
