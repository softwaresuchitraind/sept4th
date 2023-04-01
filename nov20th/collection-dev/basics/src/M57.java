import java.util.TreeSet;
class M57 
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
		System.out.println(set.ceiling(16));
		System.out.println(set.ceiling(17));
		System.out.println(set.ceiling(20));
		System.out.println(set.ceiling(30));
	}
}

/*
[1, 2, 3, 4, 5, 7, 8, 9, 17, 27]
5
17
17
27
null

-Same number or next bigger number

*/