//19. Write a java program to reverse each word of a given string?

/*
test case:
given input			=	abc hello java1 manager
output should be	=	cba olleh 1avaj reganam
*/
import java.util.Scanner;
class Q19
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String[] inputs = s1.split("\\s+");
		String s2 = "";
		for(int i = 0; i < inputs.length; i++)
		{
			s2 += reverse(inputs[i]) + " ";
		}
		System.out.println(s2);
	}
	private static String reverse(String str)
	{
		if(str.length() == 0)
		{
			return "";
		}
		return str.charAt(str.length() - 1) +
			   reverse(str.substring(0, str.length() - 1));
	}
}