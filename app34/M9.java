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
class E extend D
{
	C test()
	{
		return null;
	}
}
class  M9
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

covariant
-----------
C is a covariant of E
*/