class I
{
	I()
	{
		System.out.println("I()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		I i1= new I();
		System.out.println("-----------");
		I i2= new I();
		System.out.println("...........");
		I i3= new I();
		System.out.println("main end");
	}
}
/*
for every object creation constructor is executing.
*/