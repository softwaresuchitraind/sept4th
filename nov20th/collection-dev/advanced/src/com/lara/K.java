package com.lara;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class K 
{
	public static void main(String[] args) 
	{
		CopyOnWriteArrayList<String> list =
			new CopyOnWriteArrayList<String>();
		list.add("abc");
		list.add("test");
		list.add("check");
		list.add("done");
		Iterator<String> it = list.iterator();
		list.add("end");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list);
	}
}

/*


abc
test
check
done
[abc, test, check, done, end]

-it allows concurrentModification


This type of iterator is called as fail- safe iterator.

Memoryoverhead is there. all the data copied in another location
*/