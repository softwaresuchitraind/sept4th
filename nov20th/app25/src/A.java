class A 
{
	public static void test()
	{
		System.out.println("test()");
	}
	static void test(int i)
	{
		System.out.println("test(int)");
	}
	private static void test(int i,int j)
	{
		System.out.println("test(int,int)");
	}
	private static void test(double i)
	{
		System.out.println("test(double)");
	}
}
/*
overloaded methods can have any access levels
*/
