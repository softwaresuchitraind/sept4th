class Y 
{
	enum A
	{
		
			CON1, CON2(90), CON3, CON4("ABC");
		
		A()
		{
			System.out.println("A()");
		}
		A(int i)
		{
			System.out.println("A(int)" +i);
		}
		A(String s1)
		{
			System.out.println("A(String)" +s1);
		}
}

	public static void main(String[] args)
	{
		A a1 =  A.CON4;
		System.out.println("-------");
		System.out.println(a1);
	}

}


/*
A()
A(int)90
A()
A(String)ABC
-------
CON4
-for every constraints there should be corresponding constructor
*/