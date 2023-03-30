//8. Write a program to reverse the given string word wise?
import java.util.Scanner;
import java.util.Arrays;
class Q8A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String s2 = reverseWordWise(s1);
		s2 = s2.trim();
		System.out.println(s2);
	}
	private static String reverseWordWise(String s1)
	{
		if(s1.lastIndexOf(' ') == -1)
		{
			return s1;
		}
		return s1.substring(s1.lastIndexOf(' ') + 1, s1.length()) + " " + 
			   reverseWordWise(s1.substring(0, s1.lastIndexOf(' ')));
	}
}

