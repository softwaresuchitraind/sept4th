import java.util.LinkedHashMap;
//find out longest substring without repeating chars
class Q4 
{
	public static void main(String[] args) 
	{
		LinkedHashMap map = new LinkedHashMap();
		String s1 = "abcdhelloabc";

		//String s1 = "abcdxyzbhello";
		String s2 = "";
		int length = 0;
		char c1;
		for(int i=0; i<s1.length(); i++)
		{
			c1 = s1.charAt(i);
			if(map.containsKey(c1))
			{
				i = (Integer)map.get(c1);
				map.clear();
			}
			else
			{
				map.put(c1,i);
			}
			if(map.size() > length)
			{
				s2 = map.keySet().toString();
				length = map.size();
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
