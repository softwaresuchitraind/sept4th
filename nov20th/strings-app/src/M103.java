//Right rotate by one
import java.util.Scanner;
class M103 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter multiple words");
		String s1 = sc.nextLine();
		String s2 = s1.substring(s1.lastIndexOf(' ') + 1) + " " +
					s1.substring(0, s1.lastIndexOf(' '));
		System.out.println(s2);
	}
}
