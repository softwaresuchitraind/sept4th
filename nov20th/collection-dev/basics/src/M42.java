import java.util.HashSet;
class M42
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		System.out.println(set);
	}
}

/*
[0, 900, 90, 10, 190]
-No index is prividing and also no identifier is also providing.
-element is not assigning with index or even identifier under subString.
-That is way we can not read a paricular element.
-in oder to read a particular element we require get()
-get() is self not available
-u can read all the elements by using string()



order is not preserving.
*/
