class A 
{
	public static void test() 
	{
		System.out.println("test()");
	}
	 static void test(int i) 
	{
		System.out.println("test(int i)");
	}
	public static void test(int i,int j) 
	{
		System.out.println("test(int i,int j)");
	}
	protected static void test(double j) 
	{
		System.out.println("test(double)");
	}
}
/*
compile success
While overloading a method we can use any access levels.
*/