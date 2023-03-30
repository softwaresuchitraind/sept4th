// 9. Rotate the string word wise by one
//left rotate
import java.util.Scanner;
import java.util.Arrays;
class Q9
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String firstWord = s1.substring(0, s1.indexOf(' '));
		String s2 = s1.substring(s1.indexOf(' ') + 1) + " " + firstWord;
		System.out.println("Given string:" + s1);
		System.out.println("Left rotate by one:" + s2);
	}
}