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
}
class M68 
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

-content is same but object is different
-hashMap is unable to identify because of Object class hashCode() and equals()

*/
