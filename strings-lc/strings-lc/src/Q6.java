//6. Find out how many words are there in a given string?
import java.util.Scanner;
class Q6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		//String[] words = s1.split(" ");
		//String[] words = s1.split("\\s");
		String[] words = s1.split("\\s+");//one or more spaces
		int wordsCount = words.length;
		System.out.println("Given String:" + s1);
		System.out.println("length:" + wordsCount);
	}
}