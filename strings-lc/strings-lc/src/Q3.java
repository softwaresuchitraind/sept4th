//3. Write a program to reverse a string first half separately and 
//2nd half separately?
import java.util.Scanner;
class Q3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		char[] firstHalfchars = 
			s1.substring(0, s1.length()/2).toCharArray();
		char[] secondHalfchars = 
			s1.substring(s1.length()/2, s1.length()).toCharArray();
		char temp;
		for(int i = 0; i < (firstHalfchars.length / 2); i++)
		{
			temp = firstHalfchars[i];
			firstHalfchars[i] = firstHalfchars[firstHalfchars.length - i  - 1];
			firstHalfchars[firstHalfchars.length - i  - 1] = temp;
		}
		for(int i = 0; i < (secondHalfchars.length / 2); i++)
		{
			temp = secondHalfchars[i];
			secondHalfchars[i] = secondHalfchars[secondHalfchars.length - i  - 1];
			secondHalfchars[secondHalfchars.length - i  - 1] = temp;
		}
		String s2 = new String(firstHalfchars) + new String(secondHalfchars);
		System.out.println("Given String:" + s1);
		System.out.println("Reversed String:" + s2);
	}
}
