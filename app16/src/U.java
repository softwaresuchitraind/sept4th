class U 
{
	int i;
	public static void test()
	{
		U obj=new U();
		System.out.println("from test");
		System.out.println(obj.i);
		obj.i=10;
		System.out.println(obj.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		test();
		System.out.println("Main End");
	}
}
//Object can be created anywhere not necessarily in main mathod
//while creating object non static members loaded.
