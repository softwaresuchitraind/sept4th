import java.util.Scanner;
class Z5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Some String");
		String s1=sc.next();
				
		try
		{
			System.out.println(1);
			int i=Integer.parseInt(s1);
			System.out.println(2);
			int k=i/(i-9);
			System.out.println(3);
			
		}
		
		catch (ArithmeticException ex)
		{
			System.out.println(4);
			System.out.println(4);
		}
		catch (ArithmeticException ex1)
		{
			System.out.println(5);
			System.out.println(5);
			System.out.println(5);
		}
		System.out.println("main End");
	}
}
/*
cte
Z5.java:25: error: exception ArithmeticException has already been caught
                catch (ArithmeticException ex1)
                ^
1 error

All the catches should be differnt exception even body is changing and identifier is changing.


*we can provide multiple catches in the same try by choosing different Exceptions.
* maximum one--in any execution ---catch block is executed.

*/