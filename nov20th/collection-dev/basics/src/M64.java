import java.util.HashMap;
class M64 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc",34);
		map.put(20,"test");
		map.put(4.4,true);
		map.put(false,'a');
		System.out.println(map);
		int i = (Integer) map.get("abc");
		boolean j = (Boolean) map.get(4.4);
		System.out.println(i);
		System.out.println(j);
	}
}
/*
{abc=34, 20=test, false=a, 4.4=true}
34
true
-Every element has key, u can supply to get its corresponding value.
-get() method return type is object type u need to downcast it.
-While storing also 34 is boxing into integer Object upcasted to Object type.

*/