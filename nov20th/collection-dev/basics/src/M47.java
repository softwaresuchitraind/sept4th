import java.util.TreeSet;
class M47 
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(900);
		set.add(190);
		System.out.println(set);
	}
}

/*


[0, 10, 90, 190, 900]

-we can store the element straightway in the TreeSet.
-AutoSorting is available in the TreeSet.
-TreeSet all the elements in a sorted Order.
-TreeSet having clear features
	1--Avoiding Duplicates
	2--Auto Sorting


	All are Integer objects ---Integer class implements Comparable interface.


*/
