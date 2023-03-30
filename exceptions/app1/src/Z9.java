class Z9 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		try
		{
			System.out.println(1);
			return;//go to finally
		}
		catch (ArithmeticException ex)
		{
			System.out.println(2);
			
		}
		finally
		{
		System.out.println("from finally");
		}
		System.out.println("main end");//*
	}
}
/*
finally block execute even return statement is executed
main begin
1
from finally
*/