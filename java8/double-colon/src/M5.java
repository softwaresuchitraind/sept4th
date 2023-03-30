interface A
{
	void test1();
}
class M5
{
	void method1()
	{
		System.out.println("hello from method1");
	}
	public static void main(String[] args) 
	{
		M5 obj = new M5();
		A a1 = obj :: method1;
		a1.test1();
	}
}
