package com.lara;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;


public class L
{
	public static void main(String[] args) 
	{
		ConcurrentHashMap<String, Integer> map =
			new ConcurrentHashMap<String, Integer>();
		map.put("abc",1000);
		map.put("test",20000);
		map.put("done",12000);
		map.put("abtm",3333);
		Iterator<String> it = map.keySet().iterator();
		map.put("hello",2222222);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}

/*

abc
test
abtm
hello
done

- it is also fail safe operation

*/