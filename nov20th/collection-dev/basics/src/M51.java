import java.util.TreeSet;
class A implements Comparable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
	public int compareTo(Object obj)
	{
		return i - ((A)obj).i;
	}
}
class M51 
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		set.add(new A(90));
		set.add(new A(9));
		set.add(new A(910));
		set.add(new A(190));
		set.add(new A(920));
		System.out.println(set);
	}
}
/*
[i = 9, i = 90, i = 190, i = 910, i = 920]

-If single attribute is there go for Comparable

*/