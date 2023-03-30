interface A
{
	void test1();
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			public void test1()
			{
				System.out.println("from test1");
			}
		};
		System.out.println("Hello World!");
	}
}
