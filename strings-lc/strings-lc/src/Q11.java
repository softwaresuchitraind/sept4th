//11.	Write a java program to count the number of occurrences of each 
//		character in a string?
import java.util.Scanner;
import java.util.Arrays;
class Q11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		//System.out.println("sorted array:" + Arrays.toString(chars));
		int count = 1;
		char prevChar = chars[0], currentChar;
		for(int i = 1; i < chars.length; i++)
		{
			currentChar = chars[i];
			if(prevChar == currentChar)
			{
				count ++;
			}
			else
			{
				System.out.println(prevChar + ":" + count);
				prevChar = currentChar;
				count = 1;
			}
		}
		System.out.println(prevChar + ":" + count);
	}
}
