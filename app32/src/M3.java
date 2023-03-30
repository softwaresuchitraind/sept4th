abstract class A
{
	abstract void test();
	
}
class  B extends A
{
	void test()
	{
		System.out.println("from B.test()");
	}
}
class  C extends B
{
	void test()
	{
		System.out.println("from C.test()");
	}
}
class M3
{

	public static void main(String[] args) 
	{
		
		A a1=new B();
		A a2=new C();
		A[] elements={a1,a2};
		for(A element:elements)
		{
		element.test();
		}
		
	}
}
/*
we can create a reference variable to abstract class , we can not create an object.
from B.test()
from C.test()
*/