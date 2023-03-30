class A
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class  B extends A
{
	void test()
	{
		System.out.println("from B.test()");
	}
}
class M1
{

	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();//method overiding and auto upcasting---------object is B-type
		A[] elements={a1,a2};
		for(A element:elements)
		{
		element.test();//showing polymorphism-two times executing
		}
		
	}
}
/*
from A.test()
from B.test()---------a2 is pointing to B-object

* To achive polymorphism two features we have to provide

	1--method overriding
	2--upcasting
*/