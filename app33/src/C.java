class C 
{
	public static void main(String[] args) 
	{
		C c1= new C();
		c1=new C();

		final C c2= new C();
		c2=new C();
		System.out.println("Done");
	}
}
/*

cte
c1 is non final can be reinitialized,c2 is final can not be reinitialized
*/