import java.util.HashSet;
import java.util.TreeSet;
class M46
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
		TreeSet set1 = new TreeSet();
		//every element of HashSet we are adding into TreeSet
		set1.addAll(set);
		System.out.println(set1);
	
	}
}

/*

[0, 900, 90, 10, 190]
[0, 10, 90, 190, 900]


-There are two approches available to copy one container elemnt with other
1--Constructor
2--addAll()
*/

