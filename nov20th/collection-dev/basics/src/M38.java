import java.util.HashSet;
class M38 
{
	public static void main(String[] args) 
	{
		HashSet set	= new HashSet();
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.size());
		System.out.println(set);
	}
}
/*
true
true
true
3
[abc, abc, abc]

-Inside a StringBuffer and StringBuilder--hasCode() and equals() both are not overided.
-BEcause of that it is not identifyinng duplicates even same.
-Object class hashCode() and equals() methods available it is checking only memeory location.

*/