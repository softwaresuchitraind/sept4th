import java.util.HashSet;
import java.util.TreeSet;
class M45
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
		TreeSet set1 = new TreeSet(set);
		System.out.println(set1);
	
	}
}

/*
-For sorting purpose we have to use TreeSet for HashSet.
-In case of List we use collections.sort
-in case of Queue we use PriorityQueue.

*/