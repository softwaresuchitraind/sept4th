//13. Write a program to check whether given string is a palindrome or not?
import java.util.Scanner;
import java.util.Arrays;
class Q13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String s2 = reverse(s1);
		if(s1.equals(s2))
		{
			System.out.println(s1 + " is a palindrome");
		}
		else
		{
			System.out.println(s1 + " is not a palindrome");
		}
	}
	private static String reverse(String s1)
	{
		if(s1.length() == 0)
		{
			return "";
		}
		return s1.charAt(s1.length() - 1) + reverse(s1.substring(0, s1.length() - 1));
	}
}
