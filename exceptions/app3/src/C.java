class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			test();//propagateing/ducking
		}
		catch(ArithmeticException e)
		{
			System.out.println(2);
		}
	}
	public static void test()
	{
		System.out.println(3);
		int i=10/0;//unhandeled exception
		System.out.println(4);
	}
}