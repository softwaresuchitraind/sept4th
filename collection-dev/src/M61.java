import java.util.*;
public class M61
{
	static class A
	{
		int i;
		A(int i)
		{
			this.i = i;
		}
		public String toString()
		{
			return "(i= " + i + ")";
		}
		public int hashCode()
		{
			System.out.println("hashCode");
			return Integer.toString(i).hashCode();
		}
		public boolean equals(Object obj)
		{
			System.out.println("equals");
			return i == ((A)obj).i;
		}
	}
	public static void main(String[] args) 
	{
		IdentityHashMap<A, Integer> map = new IdentityHashMap<A,Integer>();
		A a1 = new A(90);
		map.put(a1,1000);
		map.put(a1,1000);
		map.put(a1,1000);
		System.out.println(map);
	}
}


/*
{(i= 90)=1000}

Same reference we are supplying bacause of that only one entry.
IdenttityhashMap only checks memory location ,it is not bothring about hashCode() and equals().

*/