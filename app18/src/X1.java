class X1 
{
	X1()
	{
	
	}
	void test()
	{
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}


/*

cte
-this() calling statement should be in the constructor body
not in the method.

-calling one constructor to other.
*/