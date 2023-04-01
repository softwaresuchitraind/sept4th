//24.How do you find first repeated charater
//in a given String in java
import java.util.Scanner;
class Q24A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.next();
		outer:
		for(int i =0; i<s1.length();i++)
		{
			char c1 = s1.charAt(i);
			for(int j=0;j<i;j++)
			{
				if(c1 == s1.charAt(j))
				{
				System.out.println("first repeated char:"+c1);
				break outer;
				}
			}
		}
	}
}
