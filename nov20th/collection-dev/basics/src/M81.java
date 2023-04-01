import java.util.HashMap;
import java.util.TreeMap;
class M81 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		System.out.println(map.put(22,"abc"));
		System.out.println(map.put(2,3.4));
		System.out.println(map.put(24,'a'));
		System.out.println(map.put(5,'a'));
		System.out.println(map.put(26,'a'));
		System.out.println(map.put(10,true));
		System.out.println(map);
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}
}

/*
null
null
null
null
null
null
{2=3.4, 5=a, 22=abc, 24=a, 26=a, 10=true}
{2=3.4, 5=a, 10=true, 22=abc, 24=a, 26=a}

*/