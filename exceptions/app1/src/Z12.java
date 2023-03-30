class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			System.exit(0);
			System.out.println(2);
			
		}
		catch (ArithmeticException ex)
		{
			System.out.println(3);	
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

System clas containg a static method exit(anynumber),it terminates the flow there itself,
it will not be considering any other statement to execute even though finally block is there.
*/