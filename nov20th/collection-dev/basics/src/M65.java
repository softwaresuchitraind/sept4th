import java.util.HashMap;
class M65 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc",34);
		map.put(20,"test");
		map.put(4.4,true);
		map.put(false,'a');
		System.out.println(map);
		System.out.println(map.get(20));
		System.out.println(map.get(false));
		System.out.println(map.get("test"));
		
	}
}
/*
{abc=34, 20=test, false=a, 4.4=true}
test
a
null

-For a particular key no element is assigned we get null.
-whenever u are trying to print the element which is not available get null
*/