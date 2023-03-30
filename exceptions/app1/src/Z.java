class Z
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
			int i=10/0;
			System.out.println(4);
		}
		System.out.println("main End");
	}
}
/*
main begin
1
3
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z.main(Z.java:16)

		if any exception occur in catch that exception can not be handeld in the same catch
		only catch  is for handling for try purpose.

		inside a try if any exception object is rising that is handled by catch.
*/