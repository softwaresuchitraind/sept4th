class A
{
	void test(Integer arg1, String arg2)
	{
	}
}
class M7 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test(20, "abc");
		a2.test(59, "hello");
		a3.test(1000, "hi");
		System.out.println("Hello World!");
	}
}

/*


Hello World!

*/