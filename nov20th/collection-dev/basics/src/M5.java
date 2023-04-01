import java.util.ArrayList;
import java.util.Iterator;
class M5 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		Iterator it = list.iterator();
		list.add(50);
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
if any element adding to the arraylist after getting Iterator---run time exception
--concurrentModificationException
-by default iterator not allowing concurrent modification .
After getting we supposed to read the elemet from the ArrayList
-Whichever iterator() not allowing concurrent modificatiotn that type of iterator
is called failedfast iterator.
*/