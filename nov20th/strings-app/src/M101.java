//checking balancing of brackets in the string
import java.util.Scanner;
class M101 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a String");
		String s1 = sc.next();
		//(hello{test[123]xyx}done);
		String openBrackets = "([{<";
		String closeBrackets = ")]}>";
		String temp = "";
		char c1;
		for(int i =0; i<s1.length(); i++)
		{
			c1 = s1.charAt(i);
			if(openBrackets.indexOf(c1) != -1)
			{
				temp += c1;//push
			}
			if(closeBrackets.indexOf(c1) != -1)
			{
				
				 if((c1 == ')' && temp.charAt(temp.length()-1)== '(') ||
				(c1 == '}' && temp.charAt(temp.length()-1)== '{') ||
				(c1 == ']' && temp.charAt(temp.length()-1)== '[') ||
				(c1 == '>' && temp.charAt(temp.length()-1)== '<'))

				{
					temp = temp.substring(0,temp.length()-1);
				}
				
				//removeFromTemp(temp,c1);//pop,if symetric
			}
		}
		if(temp.length()==0)
		{
			System.out.println("brackets are balanced");
		}
		else
		{
			System.out.println("brackets are not balanced");
		}
	}


/*
	static String removeFromTemp(String temp,char c1)
	{
			if((c1 == ')' && temp.charAt(temp.length()-1)== '(') ||
				(c1 == '}' && temp.charAt(temp.length()-1)== '{') ||
				(c1 == ']' && temp.charAt(temp.length()-1)== '[') ||
				(c1 == '>' && temp.charAt(temp.length()-1)== '<'))

				{
					temp = temp.substring(0,temp.length()-1);
				}   
		return temp;
	}
	*/


}
