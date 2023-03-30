//14. Write a program to check whether given two strings are anagrams?
import java.util.Scanner;
import java.util.Arrays;
class Q14A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.next();
		System.out.println("Enter Second String");
		String s2 = sc.next();
		String temp = s2;
		char c1;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			if(temp.indexOf(c1) != -1)
			{
				temp = temp.substring(0, temp.indexOf(c1)) + 
					   temp.substring(temp.indexOf(c1) + 1);
			}
			else
			{
				break;
			}
		}
		if(temp.length() == 0)
		{
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
}
