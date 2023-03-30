interface A
{
	void test();
}

class M3
{

	public static void main(String[] args) 
	{

		class B implements A
		{
			public void test()
			{
				System.out.println("from test");
			}
		}
		B b1 = new B();
		b1.test();
		B b2 = new B();
		b2.test();
		System.out.println("done");
	}
}
