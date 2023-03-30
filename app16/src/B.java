class B
{
	int i=20;//i is non static
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}

/* 

	Compile time error
even i is initialized you can not use 
non static i used in static main directly
*/