import java.util.TreeMap;
class M82 
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		System.out.println(map.put(22,"abc"));
		System.out.println(map.put(2,3.4));
		System.out.println(map.put(24,'a'));
		System.out.println(map.put(5,'a'));
		System.out.println(map.put(26,'a'));
		System.out.println(map.put(10,true));
		System.out.println(map);
	}
}
/*
-We can use TreeMap Straight way to store the element.

null
null
null
null
null
null
{2=3.4, 5=a, 10=true, 22=abc, 24=a, 26=a}

*/