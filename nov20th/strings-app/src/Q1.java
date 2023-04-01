import java.util.LinkedHashMap;
class Q1 
{
	public static void main(String[] args) 
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("hello",200);
		map.put("test",400);
		map.put("java",600);
		System.out.println(map);
		System.out.println(map.keySet());
	}
}
/*
LinkedHashMap
{hello=200, test=400, java=600}
[hello, test, java]

-We are storing 3 key value base in the LinkedHashMap
-LinkedHashMap preserving the order ,in whichever order u are adding in the same order
it is printing.


*/
