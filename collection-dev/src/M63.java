import java.util.*;
public class M63
{
	static class A
	{

	}

	public static void main(String[] args) 
	{
	
		A a1 = new A();
		HashMap<A, Integer> map = new HashMap<A, Integer>();
		map.put(a1,1000);
		System.out.println(map);
		a1 = null;
		System.gc();
		System.out.println(map);
	}
}

/*
G:\sept4th\collection-dev\src>java -cp ../classes M63
{M63$A@70dea4e=1000}
{M63$A@70dea4e=1000}


WeakHashMap
-----------------
data will be available inside HashMap as soon as reference available.

HashMap
----------
even refernce is removed,Still entry will be available.



*/
