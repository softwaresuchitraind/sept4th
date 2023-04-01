class A
{
}
class M2 
{
	public static void main(String[] args) 
		throws Exception
	{
		A a1 = new A();
		Class c1 = a1.getClass();
		Class c2 = A.class;
		Class c3 = Class.forName("A");
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
	}
}


/*
true
true

-Whenever class is loaded not only static memory is loaded but also 
Class Object loaded.
-Even class Object is creating whenever loading to memory.
Three are 3 approaches available to get Class Object
-All are refering to same Object.
-


*/