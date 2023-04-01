class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test()
	{
		System.out.println(3);
		int i =10/0;
		System.out.println(4);
	}
}
/*
as uncheched compilation does not require try and catch
*/