class A
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		A a1 = null;
		B b1 = null;
		C c1 = null;
		System.out.println("done");
	}
}
/*
A is a outer class can not be static.
-members of A class can be static.
-C is a memember of A class.
-Inner class can only be static.
-In general non static mebers can not be used in static member 
without a reference.
-Any class can be used anywhere if the usage is a datatype usage.


//non static inner classes also called as nested inner classes

-Outer classes can not be static, only inner classes can be static.

*/
