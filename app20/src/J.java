//static initializers in inheristance
class I
{
	static
	{
		System.out.println("I-SIB");
	}
}
class J extends I

{
	static
	{
		System.out.println("J-SIB");

	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
/*
I-SIB
J-SIB
done

while running J class it checks I class
I has to load before J
*/