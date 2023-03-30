//12. Write a java program to remove all white spaces from a string?
import java.util.Scanner;
import java.util.Arrays;
class Q12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		//abc xyz hello test
		//abcxyz hello test
		//abcxyzhello test
		//abcxyzhellotest
		//0123456789
		int index;
		while((index = s1.indexOf(' ')) != -1)
		{
			s1 = s1.substring(0, index) 
				 + s1.substring(index + 1);
		}
		System.out.println("final string:" + s1);
	}
}
