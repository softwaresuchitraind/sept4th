class M7 
{
	static void test(Object obj)
	{
	
	}
	public static void main(String[] args) 
	{
		test(new A());
		test(new B());
		test(new C());
		test(new D());//test((object)mew D());
		test(new E());
		C c1=null;
		test(c1);
		test("abc");//String is subclass to object class
		System.out.println("Hello World!");
	}
}
/*
compiler autometically converts to required datatype of the test
*/
