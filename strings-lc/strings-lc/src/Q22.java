//22. How do you swap two string variables without 
//	  using third or temp variable in java?
import java.util.Scanner;
class Q22
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String s1 = sc.nextLine(); // abc
		System.out.println("Enter Second String");
		String s2 = sc.nextLine(); // hello
		s1 = s1 + s2; //abchello
		s2 = s1.substring(0, s1.length() - s2.length()); //abchello.substring(0, 3)  ==> abc
		s1 = s1.substring(s2.length()); //abchello.substring(3) ==> hello
		System.out.println(s1);
		System.out.println(s2);
	}
}