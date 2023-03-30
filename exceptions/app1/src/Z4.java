import java.util.Scanner;
class Z4
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
		catch (NumberFormatException ex)
		{
			System.out.println(5);
		}
		System.out.println("main End");
	}
}
/*

G:\sept4th\exceptions\app1\src>java -cp ../classes Z4
Enter Some String
abc
1
5
main End

G:\sept4th\exceptions\app1\src>java -cp ../classes Z4
Enter Some String
9
1
2
4
main End

G:\sept4th\exceptions\app1\src>java -cp ../classes Z4
Enter Some String
18
1
2
3
main End


* for the same try<one try> have any number of catchs
*only one compartible catch will execute other catch will not execute

*/