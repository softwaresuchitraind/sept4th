//8. Write a program to reverse the given string word wise?
import java.util.Scanner;
import java.util.Arrays;
class Q8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		//String[] words = s1.split(" ");
		//String[] words = s1.split("\\s");
		String[] words = s1.split("\\s+");
		String s2 = "";
		for(int i = words.length - 1; i >= 0; i--)
		{
			s2 = s2 + " " + words[i];
		}
		s2 = s2.trim();
		System.out.println(s2);
	}
}