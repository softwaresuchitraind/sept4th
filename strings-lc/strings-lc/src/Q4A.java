//4. Write a program to rotate one char in a given string
//left rotate
import java.util.Scanner;
class Q4A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		String s2 = s1.substring(1, s1.length()) + s1.charAt(0);
		System.out.println("Given String:" + s1);
		System.out.println("Left rotate by one:" + s2);
	}
}