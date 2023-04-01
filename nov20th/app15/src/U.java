class U 
{
	static void test()
	{
		System.out.println("test()");
	}
	static void test(int i)
	{
		System.out.println("test(int)");
	}
	static void test(double i)
	{
		System.out.println("test(double)");
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("----------");
		test(20);
		System.out.println("----------");
		test(20.9);
		System.out.println("-----------");
	}
}
/*
test()
----------
test(int)
----------
test(double)
-----------
method overloading
*/