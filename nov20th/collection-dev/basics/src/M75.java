import java.util.HashMap;
class M75
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		System.out.println(map.put(22,null));
		System.out.println(map.put(23,null));
		System.out.println(map.put(24,null));
		System.out.println(map);
	}
}

/*
null
null
null
{22=null, 23=null, 24=null}

-hashMap allows null as key and value also.
-Any number of null values can be stored.

*/