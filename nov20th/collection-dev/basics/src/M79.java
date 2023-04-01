import java.util.LinkedHashMap;
class M79
{
	public static void main(String[] args) 
	{
		LinkedHashMap map = new LinkedHashMap();
		System.out.println(map.put(22,"abc"));
		System.out.println(map.put(23,3.4));
		System.out.println(map.put(24,'a'));
		System.out.println(map.put(25,'a'));
		System.out.println(map.put(26,'a'));
		System.out.println(map.put(27,true));
		System.out.println(map);
	}
}

/*

-In order to preserve the order of addition then use LinkedHashSet

*/