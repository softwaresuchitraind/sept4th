interface A
{
	void test1();
}
class K implements A
{
	public void test1()
	{
		System.out.println("from K.A()");
	}
	public static void main(String[] args) 
	{
		//A a1= new A();--error
		A a2=null;//possible
		K k1= new K();
		k1.test1();
		System.out.println("done");
	}
}
/*
from K.A()
done

A is abstact we can not create object
there is no way to create an object to interface.
-interface can be used for datatype purpose
-implements keyword is used  for inteface [A-----K]
-every interface method should be implemented 
with a public in the subclass.

-We can create a reference variable to interface
-Wherever datatype is require we can use interface.


*/