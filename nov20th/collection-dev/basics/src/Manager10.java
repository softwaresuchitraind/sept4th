import java.util.ArrayList;
public class Manager10
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);
		boolean flag = list.remove(new Integer(2));
		System.out.println(list);
		System.out.println(flag);
		flag = list.remove(new Integer(12));
		System.out.println(flag);
	}
}


/*

[9, 0, 4, 6, 8, 2, 1, 3]
[9, 0, 4, 6, 8, 1, 3]
true
false

remove() also got overloaded.


-Two types of remove() method available.it is searching object itself
to remove in all the indexes
*/