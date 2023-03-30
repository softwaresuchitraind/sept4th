import java.util.Scanner;
class Z6
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
			
		}
		finally
		{
			System.out.println(5);
			
		}
		System.out.println("main End");
	}
}
/*

G:\sept4th\exceptions\app1\src>java -cp ../classes Z6
Enter Some String
abc
1
5
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Z6.main(Z6.java:13)

G:\sept4th\exceptions\app1\src>java -cp ../classes Z6
Enter Some String
18
1
2
3
5
main End

G:\sept4th\exceptions\app1\src>java -cp ../classes Z6
Enter Some String
9
1
2
4
5
main End


-finally block is execueted in every execution no matter whether exception rising or not-rised exception
object handling or not.
--finally block should be after catchs
-it is mandatory block executrd every time.
*/