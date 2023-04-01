//anagrams
class M541 
{
	public static void main(String[] args) 
	{
		String s1 = "abc", s2 = "bca";
		String temp = s2;
		int index = 0;
		boolean flag = true;
		for(int i =0; i<s1.length();i++)
		{
			index = temp.indexOf(s1.charAt(i));
			if(index != -1)
			{
				temp = temp.substring(0,index) +
					temp.substring(index + 1);
			}
			else
			{
				flag = false;
				break;
			}

		}
		flag = temp.length() == 0 ? true : false;
		System.out.println(flag);
	}
}
