import java.util.HashSet;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i =" +i;
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
class M40 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
only one Object is adding..as hashCode() and equals() both overided.

true
false
false
1
[i =90]
*/
