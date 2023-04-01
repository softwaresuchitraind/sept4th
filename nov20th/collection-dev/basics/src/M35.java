import java.util.HashSet;
class M35 
{
	public static void main(String[] args) 
	{
		HashSet set	= new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
true
false
false
1
[90]

HashSet
--------
-It comes under set Stream.
-if it is a unique element it is adding and returning true.
-only unique elements
-No compile and run time error in case of duplicate adding only returning false
-elements are not storing in the order.
-Hashset is not maintain oder of addition.
-Order of addition is not preserving.
-Elements are not getting order of addition.
-There is no getMethod--we can not read a single specific element
-no element is assigned with a index.
-In every wrapper class and also in the String class HashCode() and equals() got
overrided to identify the duplication.
-Because of the integer wraper object we get size as 1 ,element as 9.

*/
