class A
{
	void test(String arg)
	{
	
	}
}
class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test("abc");
		a2.test("hello");
		a3.test("xyz");
		System.out.println("Hello World!");
	}
}
/*
-For every Object of A test() is a String type
-test method argument is String only no matter 
what is the Object.
*/