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

G:\nov20th\app25\src>java -cp ../classes M
main(String[])


*/
