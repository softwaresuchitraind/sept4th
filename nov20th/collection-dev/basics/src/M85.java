import java.util.TreeMap;
import java.util.Comparator;
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
		return (obj instanceof A && ((A)obj).i == i);
	}
	
}

class B implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((A)o1).i - ((A)o2).i;
	}
}
class M85 
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap(new B());
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

*/