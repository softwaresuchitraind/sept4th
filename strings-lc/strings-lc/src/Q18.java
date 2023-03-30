//18. Write a java program to reverse a given string 
//with preserving the position of spaces?
/*
test case:
given input			=	abc hello java1 manager
output should be	=	reg anam1 avajo llehcba
*/
import java.util.Scanner;
class Q18
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String s2 = "";
		for(int f = 0, b = s1.length() - 1; b >= 0; b--, f++)
		{
			if(s1.charAt(f) == ' ')
			{
				s2 += " ";
				f++;
			}
			if(s1.charAt(b) != ' ')
			{
				s2 += s1.charAt(b);
			}
			if(s1.charAt(b) == ' ' && s1.charAt(f) != ' ')
			{
				f--;
			}
		}
		System.out.println(s2);
	}
}