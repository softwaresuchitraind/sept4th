//1. Write a program to reverse a String
import java.util.Scanner;
class Q1B 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		String s2 = new StringBuffer(s1).reverse().toString();
		//String s2 = new StringBuilder(s1).reverse().toString();
		System.out.println("Given String:" + s1);
		System.out.println("Reversed String:" + s2);
	}
}





