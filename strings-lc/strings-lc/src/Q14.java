//14. Write a program to check whether given two strings are anagrams?
import java.util.Scanner;
import java.util.Arrays;
class Q14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.next();
		System.out.println("Enter Second String");
		String s2 = sc.next();
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		String sortedS1 = new String(s1Chars);
		String sortedS2 = new String(s2Chars);
		if(sortedS1.equals(sortedS2))
		{
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
}
