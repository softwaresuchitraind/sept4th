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
class M72
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		System.out.println(map.put(new A(90),34));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(new A(90),44));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(new A(90),54));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
	}
}

/*

-hashCode() and equals() overided
null
----------------
{(i=90)=34}
----------------
34
----------------
{(i=90)=44}
----------------
44
----------------
{(i=90)=54}
----------------

*/