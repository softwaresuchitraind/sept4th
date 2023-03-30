class S
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
		catch (NullPointerException ex)//Throwable
		{
			ex.printStackTrace();//the message for an exception
		}
		System.out.println("main End");
	}
}
/*
main begin
1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at S.main(S.java:9)
		
Arithmeticexception can not be handeld by the catch u provided.

there is no catch to handle try caatch
*/