//5. Find out length of the string without length() method of a String?
import java.util.Scanner;
class Q5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		//s1 = hello
		int length = (s1 + 't').lastIndexOf('t');
		System.out.println("Given String:" + s1);
		System.out.println("length:" + length);
	}
}