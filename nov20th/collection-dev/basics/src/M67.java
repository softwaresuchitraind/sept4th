import java.util.HashMap;
class M67
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		System.out.println(map.put("abc",34));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put("abc1",44));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(false,54));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
	}
}
/*
-Internally it uses hashCode and equals() to identify duplicate
*/