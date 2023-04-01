// all permutations of anagrams for a given string
//23. Write a java program to find all permutations of a String?
import java.util.Scanner;
class M542 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String s1 = sc.next();
		permutation(s1);
		
	}
	public static void permutation(String str)
	{
		permutation("",str);
	}
	private static void permutation(String prefix,String str)
	{
		int length = str.length();
		if(length == 0)
		{
			System.out.println(prefix);
		}
		else
		{
			for(int i =0; i< length; i++)
			{
				permutation(prefix+ str.charAt(i),
				str.substring(0,i) + str.substring(i + 1,length));
				
			}
		}
	}
}
