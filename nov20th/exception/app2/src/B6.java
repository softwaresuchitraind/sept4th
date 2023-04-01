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

G:\nov20th\exception\app2\src>javac -d ../classes B6.java
B6.java:14: error: unreachable statement
                        return 40;
                        ^
1 error
*/
