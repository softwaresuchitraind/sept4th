import java.util.HashMap;
class M74 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		System.out.println(map.put(null,22));
		System.out.println(map.put(null,23));
		System.out.println(map.put(null,24));
		System.out.println(map);
	}
}

/*

HashMap allows null keys but duplicate should not be
-In general it calls hashCode() and equals()

*/
