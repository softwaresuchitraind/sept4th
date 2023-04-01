import java.util.TreeSet;
class A
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
}
class M50 
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
classCastException
--------------------

-Either elements should be Comparable or we should supply a comparator
*/