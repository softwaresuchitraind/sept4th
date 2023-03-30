interface A
{
	void test1();
}
class M4
{
	void hello()
	{
		System.out.println("from hello");
	}
	public static void main(String[] args) 
	{
		A a1 = new M4() :: hello;
		a1.test1();
	}
}
