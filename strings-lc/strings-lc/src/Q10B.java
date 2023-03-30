//10. Write a java program to count the total 
//number of occurrences of a given character in a string?
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Q10B
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		System.out.println("Enter a char to search");
		String s2 = sc.next();
		int count = 0;
		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);
		for(; m1.find();)
		{
			count ++;
		}
		System.out.println("occurances:" + count);
	}
}
