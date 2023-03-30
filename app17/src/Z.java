class Z 
{
	Z()
	{
		System.out.println("Z()");
	}
	Z(int i)
	{
		this();
		System.out.println("Z(int)");
	}
	Z(int i,int j)
	{
		this(i);
		System.out.println("Z(int,int)");
	}
	public static void main(String[] args) 
	{
		Z z1=new Z();
		System.out.println("--------");
		Z z2=new Z(20);
		System.out.println("--------");
		Z z3=new Z(20,30);
		System.out.println("--------");
	}
}
/*
Z()
----
Z()
Z(int)
------
Z()
Z(int)
Z(int,int)
----------
*/
