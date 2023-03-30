class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main(String[])");
	}
	public static void main(String args) 
	{
		System.out.println("main(String)");
	}
	public static void main() 
	{
		System.out.println("main()");
	}
}
/*
compile success
main are overloaded 3 times
but compiler only looking only main(String[])
*/