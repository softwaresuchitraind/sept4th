class O 
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
			System.out.println(3);
		}
		System.out.println("main End");
	}
}
/*
main begin
1
3
main End

-mainly used try for abnormal condition statements
-try should have a catch with one argument
-catch argument should be a Throwable datatype
--all exceptions and errors are subclass to Throwable.
-catch should be immediately after try.
-inside catch body any number of any type of statements can be provided.
-

*/