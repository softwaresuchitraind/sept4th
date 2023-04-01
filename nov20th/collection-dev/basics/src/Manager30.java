import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Manager30
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(5);
		list.add(4);
		list.add(19);
		list.add(90);
		list.add(29);
		list.add(5);
		
		System.out.println(list);
		System.out.println("----------------");

		
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + ",");
		}
		System.out.println();
		System.out.println("-----------");
		ListIterator lit = list.listIterator();
		while(lit.hasNext())
		{
			System.out.print(lit.next() + ",");
		}
		
	}
}

/*


[9, 0, 5, 4, 19, 90, 29, 5]
----------------
9,0,5,4,19,90,29,5,
-----------
9,0,5,4,19,90,29,5,

- in the collection Api there are 3 interfaces to read the content

1-Iterator
2-ListIterator
3-Enumeration



-Iterator and ListIterator is not a container.
-While getting a Iterator for the ArrayList,Arraylist elements
are not copying into the Iterator as it is not a cntainer.

-Itreator and ListIterator is a pointer pointing to ArrayList.



*/
