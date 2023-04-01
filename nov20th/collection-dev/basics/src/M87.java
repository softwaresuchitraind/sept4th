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

class M87 
{
	public static void main(String[] args) 
	{
		TreeMap map = 
			
				new TreeMap(( o1, o2) -> ((A)o1).i - ((A)o2).i);
							
		System.out.println(map.put(new A(22),"abc"));
		System.out.println(map.put(new A(2),3.4));
		System.out.println(map.put(new A(24),'a'));
		System.out.println(map.put(new A(5),'a'));
		System.out.println(map.put(new A(26),'a'));
		System.out.println(map.put(new A(10),true));
		System.out.println(map);
	}
}