//27. How to search a word inside a string?
import java.util.Scanner;
public class Q27
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		//abp abcx abcdy abcd
		//0123456789
		System.out.println("Enter a word to search in " + str);
		String word = sc.next();
		//abcd
		int start = 0;
		int index = 0;
		boolean occurance = false;
		for(int i = 0; i < str.length(); i++)
		{
			if(!occurance && str.charAt(i) == word.charAt(0))
			{
				occurance = true;
				start ++;
				index = i;
				continue;
			}
			if(occurance)
			{
				if((str.charAt(i) == word.charAt(start ++)))
				{
					if(start == word.length())
					{
						break;
					}
				}
				else
				{
					occurance = false;
					start = 0;
					i--;
				}
			}
		}
		if(occurance)
		{
			System.out.println(word + " occured @ " + index);
		}
    } 
}