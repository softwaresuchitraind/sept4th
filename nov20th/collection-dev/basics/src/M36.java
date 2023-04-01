import java.util.HashSet;
class M36 
{
	public static void main(String[] args) 
	{
		HashSet set	= new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90.0));
		System.out.println(set.add("90"));
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
true
true
true
3
[90.0, 90, 90]

-Because of different type of Objects- it is not returning false
-order of addition not preserving.

*/