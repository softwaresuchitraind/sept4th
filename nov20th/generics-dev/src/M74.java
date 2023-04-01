import java.util.HashMap;
class M74 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("hello",22);
		map.put("abc",12);
		map.put("xyz",42);
		System.out.println(map);
		int i = map.get("abc");
		System.out.println(i);
	}
}

/*


no compile time warnings --it is taking two arguments
1st argument is a key and second argument is a value

{abc=12, xyz=42, hello=22}
12

//before jdk1.5

class HashMap <K, V>
{
	public V put(K key, K value)
	{
		//some statements
	}
	public V get(K key )
	{
		//some statements
	}
}
*/
