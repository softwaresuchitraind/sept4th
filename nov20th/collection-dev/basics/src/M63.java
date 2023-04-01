import java.util.HashMap;
class M63 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc",34);
		map.put(20,"test");
		map.put(4.4,true);
		map.put(false,'a');
		System.out.println(map);
	}
}
/*
{abc=34, 20=test, false=a, 4.4=true}

-HashMap is a Map type.
-Map is not extending with Collection interface.
-Map is part of Collection.
-Under Map ,Hash
-put method is taking 2 arguments to store the data.
-1st argument is is key,2nd argument is a value or element.
-Both arguments are Object type
-Because of both arguments are Object type,u can use both arguments of any datatype.
-It is storing in ramdom order.
-order is not preserving u will be get any order.
-Random order but every element is assigned with its associated key.


*/