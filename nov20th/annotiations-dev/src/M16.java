class A
{
	void test1()
	{
	}
}
class B extends A
{
	@Override
	void test1()
	{
	}
	void test2()
	{
	}
}
class M16 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
Hello World!

There is a bulid in annotation @override that is availble in jdk
u can describe it while overriding.
it is not mandatory but always advisable

*/