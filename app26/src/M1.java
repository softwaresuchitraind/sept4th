interface A
{
	static void test()
	{
		System.out.println("A.test()");
	}
}
class  M1
{
	public static void main(String[] args) 
	{
		A.test();
		System.out.println("done");
	}
}
/*
Interface
______________
* Interfaces 1.8 onwards
interfaces can have static method methods,static defined methods, default methods.

*/
