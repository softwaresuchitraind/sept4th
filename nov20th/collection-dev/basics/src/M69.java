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
class M69
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		A a1 = new A(90);
		System.out.println(map.put(a1,34));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(a1,44));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
		System.out.println(map.put(a1,54));
		System.out.println("----------------");
		System.out.println(map);
		System.out.println("----------------");
	}
}