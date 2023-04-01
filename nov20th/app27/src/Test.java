class Test 
{
	public static void method1(Object obj)
	{
		C c1 =(C)obj;
		System.out.println("done");
	}
	public static void method2(Object obj)
	{
		if(obj instanceof A)
		{
			A a1 =(A)obj;
			System.out.println("Converting into A");
		}
		if(obj instanceof B)
		{
			B b1 =(B)obj;
			System.out.println("Convering into B");
		}
		if(obj instanceof C)
		{
			C c1 =(C)obj;
			System.out.println("Convering into C");
		}
		if(obj instanceof D)
		{
			D d1 =(D)obj;
			System.out.println("Convering into D");
		}
		if(obj instanceof E)
		{
			E e1 =(E)obj;
			System.out.println("Convering into E");
		}
	}
	
}
