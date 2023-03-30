interface A
{
	void test1();
}
class  B
{
	void test2()
	{
		System.out.println("from test2");
	}
}
class O extends B implements A
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		o1.test1();
		o1.test2();
		System.out.println("done");
	}
}

/*

order should be first extends then implements
*/
