class N 
{
	static
	{
		System.out.println("N.SIB");
	}
	N()
	{
		System.out.println("N()");
	}
	public static void main(String[] args) 
	{
		System.out.println(" Main Begin");
		N n1= new N();
		System.out.println("-----------");
		N n2= new N();
		System.out.println("-----------");
		N n3= new N();
		System.out.println("-----------");
		System.out.println("Main End");
	}
}

/*
Difference between SIB and constructor

SIB executing only once when class is loading before main but
for every object creation class is loaded.
*/
