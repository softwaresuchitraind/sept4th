//24. How do you find first repeated and non-repeated character 
//in the given string in java?
import java.util.Scanner;
class Q24
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char current = '\u0000';
		outer:
		for(int i = 0; i < s1.length(); i++)
		{
			current = s1.charAt(i);
			for(int j = i + 1; j < s1.length(); j++)
			{
				if(current == s1.charAt(j))
				{
					break outer;
				}
			}
		}
		System.out.println("first repeated char: " + current);
		current = '\u0000';
		boolean flag;
		for(int i = 0; i < s1.length(); i++)
		{
			flag = true;
			current = s1.charAt(i);
			for(int j = 0; j < s1.length(); j++)
			{
				if(current == s1.charAt(j) && i != j)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		System.out.println("first non repeated char: " + current);
	}
}