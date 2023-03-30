interface A
{
	void test1();
}
abstract class T implements A 
{
	public void test1(int i) 
	{
		System.out.println("Hello World!");
	}
}

/*
two methods are there in T class this is called method overloading.
one is abstract method and other is concrete
*/