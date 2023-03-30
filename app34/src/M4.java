class A
{
	static final void test1()
	{
	}
	static void test2()
	{
	}
}
class B extends A
{
	static void test1()
	{

	}
	static  void test2()
	{
	}
}
class  M4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
static final are allowed.
static and final restricts one more method in the subclass.
static development is one time not more than one time.
static methods are not overriding.
while achieving static and final we are achiving avoidig of one more method in the subclass.



M4.java:12: error: test1() in B cannot override test1() in A
        static void test1()
                    ^
  overridden method is static,final
1 error
*/