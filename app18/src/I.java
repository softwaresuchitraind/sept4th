class I
{
	I()
	{
		System.out.println("I()");
	}
	
	I(int x)
	{
		
		System.out.println("I(int)");
	}
	I(double x)
	{
		this(10);
		System.out.println("I(double)");
	}
	{
		System.out.println("I-IIB");
	}
	public static void main(String[] args) 
	{
	    System.out.println(" Main begin");

		I obj1= new I();
		System.out.println("-----");
		I obj2= new I(2.5);
		System.out.println("-----");
		I obj3= new I(2);
		System.out.println("-----");
		System.out.println("Main End");
	}
}
/*
for every object creatiton IIB executed once.
from the body of we can call another constructor through this()
IIB is swaitable for common initialization of every object.
*/
