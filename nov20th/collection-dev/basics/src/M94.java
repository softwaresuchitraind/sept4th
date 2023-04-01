import java.util.HashMap;
class M94 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc", 300);
		map.put(30, "test");
		map.put(false,500);
		map.put("hello",'a');
		System.out.println(map);
		System.out.println(map.keySet());
	}
}

/*

{abc=300, false=500, hello=a, 30=test}
[abc, false, hello, 30]

- All keys are unique --no duplicates
-keySet() method returning all the keys to set
-keySet() reading all the elements form HashMap

HashMap
-----------
no sorting is happening
keys can be any data type.

*/
