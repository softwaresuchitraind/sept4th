interface A
{
	void test();
}

class M6
{

	public static void main(String[] args) 
	{

		A a1 = () -> 
		{
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");
			System.out.println("from test");

		};
		a1.test();
		System.out.println("done");
	}
}
