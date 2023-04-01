import java.util.HashSet;
class M37 
{
	public static void main(String[] args) 
	{
		HashSet set	= new HashSet();
		System.out.println(set.add(90.0));
		System.out.println(set.add(90.0));
		System.out.println(set.add("90.0"));
		System.out.println(set.add("90.0"));
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
true
false
true
false
2
[90.0, 90.0]
-internally it uses instance of operator
-2nd element is not adding as hashCode() and equal() identifying duplicates.
-3rd one is String Object so adding is success.

*/