//20. Write a java program to find the percentage of uppercase letters, 
// lowercase letters, digits and special characters in a given string?
import java.util.Scanner;
class Q20
{
	public static void main(String[] args) 
	{
		/*
		int p = 'a';
		int q = 'z';
		int r = 'A';
		int s = 'Z';
		int t = '0';
		int u = '9';
		System.out.println("a:" + p);
		System.out.println("z:" + q);
		System.out.println("A:" + r);
		System.out.println("Z:" + s);
		System.out.println("0:" + t);
		System.out.println("9:" + u);
		*/
		/*
			a:97
			z:122
			A:65
			Z:90
			0:48
			9:57
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int digitsCount = 0;
		int splCharsCount = 0;
		int current;
		for(int i = 0; i < s1.length(); i++)
		{
			current = s1.charAt(i);
			if(current >= 97 && current <= 122)
			{
				lowerCaseCount ++;
			}
			else if(current >= 65 && current <= 90)
			{
				upperCaseCount ++;
			}
			else if(current >= 48 && current <= 57)
			{
				digitsCount ++;
			}
			else
			{
				splCharsCount ++;
			}
		}
		System.out.println("Lowercase alphabets:" + lowerCaseCount);
		System.out.println("Uppercase alphabets:" + upperCaseCount);
		System.out.println("Digits alphabets:" + digitsCount);
		System.out.println("Spl Chars:" + splCharsCount);
	}
}