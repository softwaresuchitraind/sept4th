import java.util.Scanner;
class Z3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some thing");
		String s1 = sc.next();
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int k = i/(i-9);
			System.out.println(3);
		}
	
		catch (ArithmeticException ex1)
			{
				System.out.println(4);
			}
			
		
		System.out.println("main end");
	}
}

/*

G:\nov20th\exception\app1\src>java -cp ../classes Z3
enter some thing
abc
1
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Z3.main(Z3.java:12)

There is no catch to handle NumberFormatException
*/