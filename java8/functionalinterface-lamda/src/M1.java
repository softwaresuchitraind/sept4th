interface A
{
	void test();
}
class B implements A
{
	public void test()
	{
		System.out.println("from test");
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		B b2 = new B();
		b2.test();
		System.out.println("done");
	}
}
