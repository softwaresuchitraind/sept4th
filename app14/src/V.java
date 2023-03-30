class V 
{
	static
	{
		System.out.println("V.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("V.main begin");
		System.out.println(U.i);
		System.out.println(".............");
		System.out.println(U.i);
		System.out.println("...........");
		System.out.println("V.main");
	}
}

/*
compiler searching for U.java file 
that is compiled autometically.
if you want to 
U class should be saved in U.java
*/