class V
{
	V()throws ClassNotFoundException
	{
		System.out.println("V()");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("main begin");
		V v1 = new V();
		System.out.println("main end");
	}
}

/*

*/