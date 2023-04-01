import java.util.HashMap;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i="+i+")";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)
	{
		return (obj instanceof A && ((A)obj).i ==i);
	}
}
class M71
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		A a1 = new A(90);
		A a2 = new A(90);
		A a3 = new A(90);
		System.out.println(map.put(a1,34));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(a2,44));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(a3,54));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
	}
}

/*

-hashcode() and equals() calling hashMap--it is based on content not memory address
-avoiding duplicates hashCode() and equals()

*/