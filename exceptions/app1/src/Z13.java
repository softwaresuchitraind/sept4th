class Z13
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
			
		}
		catch (ArithmeticException ex)
		{
			System.out.println(3);	
			System.exit(0);
			System.out.println(4);
		}
		finally
		{
		System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
/*
main begin
1
3



*terminates after System.exit(0)------finally block is not executed.
*/