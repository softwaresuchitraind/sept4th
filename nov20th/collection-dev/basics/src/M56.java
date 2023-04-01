import java.util.TreeSet;
class M56 
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
		set.add(17);
		set.add(27);
		System.out.println(set);
		System.out.println(set.floor(5));
		System.out.println(set.floor(16));
		System.out.println(set.floor(17));
		System.out.println(set.floor(20));
		System.out.println(set.floor(30));
	}
}

/*
[1, 2, 3, 4, 5, 7, 8, 9, 17, 27]
5
9
17
17
27

-except 6 all emements are there
-navigationable feature
-if same number is availble same number else lesser number

*/
