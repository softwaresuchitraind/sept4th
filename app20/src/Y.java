class V
{
	static
	{
		System.out.println("V-SIB");
	}
	V()
	{
		System.out.println("V()");
	}
	
	{
		System.out.println("V-iib");
	}
}
class W extends V 
{
	static
	{
		System.out.println("W.SIB");
	}
	W()
	{
		System.out.println("W()");
	}
	
	{
		System.out.println("W-iib");
	}
	
}
class X extends W
{
	
	X()
	{
		System.out.println("X()");
	}
	static
	{
		System.out.println("X.SIB");
	}
	{
		System.out.println("X-iib");
	}
}
class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1= new V();
		System.out.println("--------");
		X x1= new X();
		System.out.println("main end");
	}
}