import java.util.Scanner;
class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
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
G:\nov20th\exception\app1\src>java -cp ../classes Z7
main begin
1
3
from finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Z7.main(Z7.java:17)

finally block executes without fail once contro enters inside atry.
-even unhandled exception is there.

*/