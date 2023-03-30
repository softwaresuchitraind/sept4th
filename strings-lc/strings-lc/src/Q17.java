//17. Write a java program to check whether one string is a rotation of another?
import java.util.Scanner;
import java.util.Arrays;
class Q17
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String");
		String s2 = sc.nextLine();

		String lastWord = s1.substring(s1.lastIndexOf(' ') + 1);
		String s3 = lastWord + " " + s1.substring(0, s1.lastIndexOf(' '));

		String firstWord = s1.substring(0, s1.indexOf(' '));
		String s4 = s1.substring(s1.indexOf(' ') + 1) + " " + firstWord;

		if(s2.equals(s3) || s2.equals(s4))
		{
			System.out.println(s1 + " is rotation of " + s2);
		}
		else
		{
			System.out.println(s1 + " is not a rotation of " + s2);
		}
	}
}