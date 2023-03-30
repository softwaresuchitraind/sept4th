class I
{
	int x;
	static int y;

	void test1()
	{
		System.out.println("test1");
	}
	static void test2()
	{
		System.out.println("test2");
	}
}

class  J extends I
{
	int m;
	static int n;
	void method1()
	{
		System.out.println("from method1");
	}
	static void method2()
	{
		System.out.println("from method2");
	}
	public static void main(String[] args) 
	{

		System.out.println(J.y);
		System.out.println(J.n);
		J.test2();
		J.method2();
		J obj= new J();
		System.out.println(obj.x);
		System.out.println(obj.m);
		obj.test1();
		obj.method1();
	}
}
