class O 
{
	public static void main(String[] args) 
	{
		Month t1 = Month.JAN;
		Month t2 = Month.DEC;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		int i = Month.FEB.ordinal();
		System.out.println(i);
	}
}

/*
ordinal()---it is a non static method returns index number-- u have to use through 
reference of enum
*/