import java.util.TreeMap;
class A implements Comparable
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
		return (obj instanceof A && ((A)obj).i == i);
	}
	public int compareTo(Object obj)
	{
		return i - ((A)obj).i;
	}
}
class M84 
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		System.out.println(map.put(new A(22),"abc"));
		System.out.println(map.put(new A(2),3.4));
		System.out.println(map.put(new A(24),'a'));
		System.out.println(map.put(new A(5),'a'));
		System.out.println(map.put(new A(26),'a'));
		System.out.println(map.put(new A(10),true));
		System.out.println(map);
	}
}

/*

null
null
null
null
null
null
{(i=2)=3.4, (i=5)=a, (i=10)=true, (i=22)=abc, (i=24)=a, (i=26)=a}
sorting is based on A object i value
*/