//Write a java program to reverse a given string
//with preserving position of spaces

/*
	abc hello xyz test
	tse tzyxo lle hcba
*/
import java.util.Scanner;
class M104 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter multiple words");
		String s1 = sc.nextLine();
		String s2 = "";
		for(int i = 0, j = s1.length() -1; j>=0; i++, j--)
		{
			if(s1.charAt(i) == ' ')
			{
				s2 += s1.charAt(i++);
			}
			if(s1.charAt(j) == ' ')
			{
				s2 += s1.charAt(--j);
			}
			else
			{
				s2 +=s1.charAt(j);
			}
			
		}
		System.out.println(s2);
	}
}
