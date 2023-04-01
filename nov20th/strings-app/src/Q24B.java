//24.How do you find first non repeated charater
//in a given String in java
import java.util.Scanner;
class Q24B
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.next();
		for(int i =0; i<s1.length();i++)
		{
			char c1 = s1.charAt(i);
			boolean flag = true;
			for(int j=0;j<s1.length();j++)
			{
				if(i !=j && c1 ==s1.charAt(j))
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("first non repeated character:" +c1);

			}
		}
	}
}
