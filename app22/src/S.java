interface A
{
	void test1();
}
class S implements A
{
	public void test1(int i)
	{
	System.out.println("from test(int)");
	}

	public static void main(String[] args) 
	{
		S s1=new S();
		s1.test(20);
		System.out.println("Hello World!");
	}
}
/*
cte
signature should be same while implementing abstract method.
*/