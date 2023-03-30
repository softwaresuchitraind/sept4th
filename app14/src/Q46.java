//46. Find out given 2 numbers are nangrams or not
//Anagrams for 123 are 321, 312, 213 , 231
class Q46 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("enter 2 command line args");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		boolean flag = (s1.length() == s2.length()) && bothAreAnagrams(s1, s2);
		if(flag)
		{
			System.out.println(s1 + " and " + s2 + "are anagrams");
		}
		else
		{
			System.out.println(s1 + " and " + s2 + "are not anagrams");
		}
	}
	public static boolean bothAreAnagrams(String s1, String s2)
	{
		//s1 = 123
		//s2 = 312
		boolean flag = false;
		int index;
		char c1;
		int i = 0;
		for(; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			index = s2.indexOf(c1);
			if(index == -1)
			{
				break;
			}
			s2 = s2.substring(0, index) +
				 s2.substring(index + 1, s2.length());
		}
		flag = (i == s1.length() && s2.length() == 0);
		return flag;
	}
}
