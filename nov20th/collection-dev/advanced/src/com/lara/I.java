package com.lara;
import java.util.ArrayList;
import java.util.Iterator;
public class I 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		Iterator<String> it = list.iterator();
		list.add("end");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

/*
Exception in thread "main" java.util.ConcurrentModificationException
        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:907)
        at java.util.ArrayList$Itr.next(ArrayList.java:857)
        at com.lara.I.main(I.java:16)


-By default Iterator is a fail-fast Iterator.

*/