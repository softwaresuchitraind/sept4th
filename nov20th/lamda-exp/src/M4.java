interface A
{
	void test();
}
class M4
{
	
	public static void main(String[] args) 
	{
			A a1 = new A()
			{
				public void test()
				{
					System.out.println("from test");
				}
			};
		a1.test();
		System.out.println("done");
	}
}

/*
through anonymous inner class we are implementing method of A
from test
done

*/