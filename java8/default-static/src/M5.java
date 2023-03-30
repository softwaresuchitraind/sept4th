abstract class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	void test()
	{
		System.out.println("from testL: "+i);
	}
}
class B extends A
{
	B(int i)
	{
		super(i);
	}
}

class M5 
{
	public static void main(String[] args) 
	{
		B b1 = new B(90);
		B b2 = new B(190);
		b1.test();
		b2.test();
		System.out.println("Hello World!");
	}
}
