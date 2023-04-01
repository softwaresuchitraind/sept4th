class C 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1 = new C();

		final C c2 = new C();
		c2 = new C();
		System.out.println("done");
	}
}
/*
c2 is final and should not be modified
line no-9 gives cte
*/