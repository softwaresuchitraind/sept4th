import java.util.TreeSet;
import java.util.Set;
class M58 
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(4);
		set.add(9);
		set.add(8);
		set.add(1);
		set.add(7);
		System.out.println(set);
		Set set1 = set.headSet(5);
		Set set2 = set.headSet(6);
		System.out.println(set1);
		System.out.println(set2);
	}
}
/*
[1, 2, 3, 4, 5, 7, 8, 9]
[1, 2, 3, 4]
[1, 2, 3, 4, 5]
-Specified element inclusive or not
-Before 5 whatever elements are there
-Before 6 whatever elements are there
-By default specified element is exclusive
*/