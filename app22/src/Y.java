//Method overiding
class A
{
	void test()
	{
		System.out.println("A.test()");
	}
}
class B extends A 
{
	void test()
	{
		System.out.println("B.test()");
	}
}
class Y
{

	public static void main(String[] args) 
	{
		B b1= new B();
		b1.test();
		System.out.println("done");
	}
}
/*
A class test() is not available in B called method overriding.
*/