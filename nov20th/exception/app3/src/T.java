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
G:\nov20th\exception\app3\src>java -cp ../classes T
main begin
from test
main end
*/