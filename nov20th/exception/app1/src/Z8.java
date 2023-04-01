import java.util.Scanner;
class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x = 10/0;
		try
		{
			System.out.println(1);
			int i = 10/0;
			System.out.println(2);
		}
	
		catch (ArithmeticException ex)
		{
				System.out.println(3);
				int i = 10/0;
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
G:\nov20th\exception\app1\src>java -cp ../classes Z8
main begin
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z8.main(Z8.java:7)


-If something is happening before try catch is not executing
and even finally also.
*/