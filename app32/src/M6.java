class  A
{
	public static void test()// it is inherting but acting as A method
	{
		System.out.println("from A.test()");
	}
	
}
class  B extends A
{
	public static void test()
	{
		System.out.println("from B.test()");
	}
}

class M6
{

	public static void main(String[] args) 
	{
		
		A a1=new A();//inside a1 no static method called
		A a2=new B();//while creating object to B---no static method called
		A[] elements={a1,a2};
		for(A element:elements)
		{
		element.test();//compiler checking test() replaces refernce to classes name---bacause of  A type reference compiler replaces A.test()
		//compiler checks element datatype------A.test();
		}
		
	}
}

/*
*if something is not going to change further then define the method as static.
*static members can not be overiding in subclass.
*once you develop static can not modified
from A.test()
from A.test()
A class static members will always acting as a members to A only.

inside B class total two members are there but only one


* we can not overide static members
*static members should not be abstract
*Static is only one type development, we can not modify

*/