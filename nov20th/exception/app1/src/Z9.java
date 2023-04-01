class Z9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			return;
		}
	
		catch (ArithmeticException ex)
		{
				System.out.println(2);
			
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
from finally

-finally block is guarenteed to execute once control enters inside a try
even retun statement

*/