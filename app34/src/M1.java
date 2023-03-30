class A 
{
	void test1()
	{
	
	}
	final void test2()
	{
	
	}
}
class B extends A
{
	void test1()
	{
	
	}
	void test2()
	{
	
	}
}
class M1
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
M1.java:18: error: test2() in B cannot override test2() in A
        void test2()
             ^
  overridden method is final
1 error

test2() can not overided because super class test2 is final
-final method should be used in B without modifying,without distrubing,without overriding
-non final method of super class can be modified in the subclass.
*/