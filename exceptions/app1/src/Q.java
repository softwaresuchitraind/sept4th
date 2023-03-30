class Q
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
		catch (ArithmeticException ex)//Throwable
		{
			System.out.println(ex.getMessage());//the message for an exception
		}
		System.out.println("main End");
	}
}
/*
main begin
1
/ by zero
main End


getMessage will returning the reason for exception.
*/