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
}
class M39 
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
true
true
true
3
[i =90, i =90, i =90]


-it is same as StringBuffer-all elements adding successfully even though i value same

1991
*/
