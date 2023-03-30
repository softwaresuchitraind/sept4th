import java.util.*;
public class M62
{
	static class A
	{

	}

	public static void main(String[] args) 
	{
	
		A a1 = new A();
		WeakHashMap<A, Integer> map = new WeakHashMap<A, Integer>();
		map.put(a1,1000);
		System.out.println(map);
		a1 = null;
		System.gc();
		System.out.println(map);
	}
}

/*
G:\sept4th\collection-dev\src>java -cp ../classes M62
{M62$A@70dea4e=1000}
{}


WeakHashMap
-----------------
data will be available inside HashMap as soon as reference available.



*/
