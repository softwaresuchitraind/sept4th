import java.util.ArrayList;
import java.util.ListIterator;
class M7 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		ListIterator it = list.listIterator();
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		System.out.println(list);
	}
}
/*
ListIterator is a interface extending Iterator
1. hasNext()
2. next()
3. remove()
4.hasPrevious()
5.previous()
6.add()
7.set()
8.nextIndex()
9.previousIndex()

-not only Iterator method several other methods are avilable
-We can not create an object to ListIterator

-ListIterator is also not a container-it is a pointer,pointing to elements of Arraylist
-once pointer goes to rightmost hasNext() returns false.

*/