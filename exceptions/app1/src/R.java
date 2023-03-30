class R
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
			ex.printStackTrace();//the message for an exception
		}
		System.out.println("main End");
	}
}
/*
main begin
1
java.lang.ArithmeticException: / by zero
        at R.main(R.java:9)
main End


u get more information about handled exception.

-- u get line number.
-catch can be empty-- u dont get message
-3 ways are there
*/