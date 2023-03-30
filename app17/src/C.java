class C 
{
	void test()//nonstatic
	{
		System.out.println("JAGAN"+this);
	}
	public static void main(String[] args) 
	{
		C c1= new C();
		System.out.println("CHINU :"+c1);
		c1.test();
	}
}
/*
this is nothing but c1 in the body of test method
this is not available in static members it is available in non static member.

*/