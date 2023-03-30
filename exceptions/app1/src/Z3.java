import java.util.Scanner;
class Z3
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
		//no catch with NumberFormatException
		catch (ArithmeticException ex)
		{
			System.out.println(4);
		}
		System.out.println("main End");
	}
}
/*

G:\sept4th\exceptions\app1\src>java -cp ../classes Z3
Enter Some String
suchitra
1
Exception in thread "main" java.lang.NumberFormatException: For input string: "suchitra"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Z3.main(Z3.java:13)

G:\sept4th\exceptions\app1\src>java -cp ../classes Z3
Enter Some String
9
1
2
4
main End

G:\sept4th\exceptions\app1\src>java -cp ../classes Z3
Enter Some String
18
1
2
3
main End
*/