import java.util.HashMap;
class M96
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
		
	}
}

/*
map.entrySet()

{abc=300, false=500, hello=a, 30=test}
[abc=300, false=500, hello=a, 30=test]

-it is retriving all the elements 
*/