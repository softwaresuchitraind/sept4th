class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int [] x = new int[99999999];
			System.out.println(2);
		}
		catch (OutOfMemoryError ex) //Throwable
		{
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
/*
Errors can be handled

main begin
1
2
main end
*/