class Test 
{
	public static void method1(Object obj) 
	{
		C c1=(C)obj;
		System.out.println("Hello World!");
	}
	public static void method2(Object obj) 
	{
		if(obj instanceof A)
		{
		A a1=(A)obj;
		System.out.println("Converting to A");
		}
		if(obj instanceof B)
		{
		B b1=(B)obj;
		System.out.println("Converting to B");
		}
		if(obj instanceof C)
		{
		C c1=(C)obj;
		System.out.println("Converting to C");
		}
		if(obj instanceof D)
		{
		D d1=(D)obj;
		System.out.println("Converting to D");
		}
		if(obj instanceof E)
		{
		E d1=(E)obj;
		System.out.println("Converting to E");
		}
	}
}

/*
always use instanceof operator while downcasting
*/