import java.util.ArrayList;
public class Manager13
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(9);
		list1.add(0);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		ArrayList list2 = new ArrayList();
		list2.add(5);
		list2.add(4);
		list2.add(2);
		list2.add(8);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("----");
		list1.retainAll(list2);
		System.out.println(list1);
		System.out.println(list2);
	}
}

/*
[9, 0, 4, 6, 8, 2, 1, 3]
[5, 4, 2, 8]
----
[4, 8, 2]
[5, 4, 2, 8]


-retaing elements list2 elements in the list1 and other elements remove
*/
