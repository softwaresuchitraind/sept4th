import java.util.HashMap;
import java.util.Set;
class M95 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc",300);
		map.put(30,"test");
		map.put(false,500);
		map.put("hello",'a');
		System.out.println(map);
		Set keys = map.keySet();
		for(Object key : keys)
		{
			System.out.println(key+ ":" +map.get(key));
		}
	}
}

/*
-if u dont know keys then apply KeySet() of Set
-under Collection interface
-To read element of Map we can not read enhanced for loop-- it is only for Collections

{abc=300, false=500, hello=a, 30=test}
abc:300
false:500
hello:a
30:test


*/
