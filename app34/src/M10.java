class A
{
}
class B extends A
{
}
class C extends B
{
}

class D
{
	B test()
	{
		return null;
	}
}
class E extends D
{
	A test()//cte-----chose subclass type
	{
		return null;
	}
}
class  M10
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*


*/