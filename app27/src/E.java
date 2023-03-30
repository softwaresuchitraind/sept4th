abstract class E
{
	public static void test() 
	{
		System.out.println("test()");
	}
	 final int test(int i)
	{
	 System.out.println("test(int i)");
	 return 20;
	 }
	abstract boolean test(double i);
	
}

/*
overloaded method -all can be final,few can be final.
-two methods with different sgnature can be overloaded.
*/