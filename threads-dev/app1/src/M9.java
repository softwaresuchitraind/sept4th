abstract class B
{
	abstract void test1();
	void test2()
	{
		System.out.println("from B.test2()");
	}
}
class  M9
{
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.test2();
		System.out.println("Hello World!");
	}
}
/*
We can not create an object to abstract class
*/