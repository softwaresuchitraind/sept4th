import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class M97
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc",300);
		map.put(30,"test");
		map.put(false,500);
		map.put("hello",'a');
		System.out.println(map);
		System.out.println(map.entrySet());

		//retriving entry object into Set
		Set entries = map.entrySet();

		// Map is a interface-so we can create inner interface--Entry is another interface
		Map.Entry entry;
		for(Object obj : entries)
		{
			entry	= (Map.Entry) obj;
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		
	}
}

/*

{abc=300, false=500, hello=a, 30=test}
[abc=300, false=500, hello=a, 30=test]
abc:300
false:500
hello:a
30:test

-for every put method one entry object is created
*/