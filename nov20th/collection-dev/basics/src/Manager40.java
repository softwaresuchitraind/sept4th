import java.util.ArrayList;
import java.util.ListIterator;
public class Manager40
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(91);
		list.add(8);
		list.add(7);
		ListIterator lit = list.listIterator();	
		while(lit.hasNext())
		{
			Object obj = lit.next();
			if (obj.equals(91))
			{
				lit.set("abc");
			}
			System.out.print(obj + ",");
		}
		System.out.println();
		System.out.println(list);
		
	}
}

/*

set--if the element is 91 replace it with abc



90,0,9,91,8,7,
[90, 0, 9, abc, 8, 7]



Iterator
---------

public boolean hasNext()
public Object next()
public void remove()


ListIterator
----------------


public boolean hasNext()
public Object next()
public void remove()
public boolean hasPrevious()
public Object previous()
public void add(Object obj)
public void set(Object obj)
public int nextIndex()
public int previousIndex()


Difference 
---------------
-Iterator is iterating elements only one time to the forword direction.
-LIstIsterator we can iterate any number of time in any direction.

-By using Iterator reading and remove is possible. we can not add and update
any elements
-ListIterator-----not only read and remove we can add and update elements.


-There is no way of reading index number in case of Iterator.
-Using ListIterator we can able to know nextIndex() and previousIndez().



Why we require Iterator and ListIterator .
-------------------------------------------

-U want to share elements of ArrayList to another customer or any kind
of service , if ur supplying Arraylist reference they can do anything .
They can be owner to Arraylist.

-If u want to provide limited access you have to decide which reference
u have to provide Iterator or ListIterator.





*/
