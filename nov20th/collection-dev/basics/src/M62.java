import java.util.Set;
import java.util.TreeSet;
class M62 
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
		Set set1 = set.tailSet(5,false);
		Set set2 = set.tailSet(4,true);
		System.out.println(set1);
		System.out.println(set2);
	}
}

/*
[1, 2, 3, 4, 5, 7, 8, 9]
[ 7, 8, 9]
[4,5,7, 8, 9]

-By default specified element is inclusive
- u can control second argument by using true or false
*/