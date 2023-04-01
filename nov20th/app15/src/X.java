class X
{
	void test(int i)
	{
		System.out.println("test(int)");
	}
	void test(double i)
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		X obj = new X();
		obj.test(10);
		obj.test(10.5);
		System.out.println("done");
	}
}
