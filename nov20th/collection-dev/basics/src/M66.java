import java.util.HashMap;
class M66 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		System.out.println(map.put("abc",34));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put("abc",44));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put("abc",54));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
	}
}
/*
-We can not assign more than one element to same key,Keys should be unique
-for one key only one element.
-keys can not be duplicate.
-To avoid the duplication it uses hashCode() and equals() method

*/
