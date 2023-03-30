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
	C test()//return type as co variant/subclass type
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