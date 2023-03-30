interface A
{
	public static void test()
	{
		System.out.println("from test");
	}
}
class  M1
{
	public static void main(String[] args) 
	{
		A.test();
		System.out.println("==========");
		A.test();
		System.out.println("==========");
		A.test();
		System.out.println("==========");
	}
}
