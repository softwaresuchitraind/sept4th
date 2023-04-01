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
class  Y
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
/*
method overiding--- A new implimentation---same signature superclass and sub class test() of A overided
inside a B class.

B.test()
done
*/
