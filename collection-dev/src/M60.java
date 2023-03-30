import java.util.*;
public class M60
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
		IdentityHashMap<A, Integer> map = new IdentityHashMap<M60.A,Integer>();
		map.put(new A(90),1000);
		map.put(new A(90),1000);
		map.put(new A(90),1000);
		System.out.println(map);
	}
}


/*
{(i= 90)=1000, (i= 90)=1000, (i= 90)=1000}


Is is identifying duplicates only based on the memory location.

hashCode() and equals() will not execute in case of IdentityHashMap.
*/