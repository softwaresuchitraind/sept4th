class T
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		try
		{
			test();	
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main end");
		
		
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}
/*
main begin
from test

method can throw classNotFoundException even though it does not have class.forname.
*/