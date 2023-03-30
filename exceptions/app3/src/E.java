class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("ex");
		}
		System.out.println("main end");
	}
}
/*
main begin
main end
Even though try no statements in try compiler allows us to catch box
-try can be empty if catch is uncheckes
*/