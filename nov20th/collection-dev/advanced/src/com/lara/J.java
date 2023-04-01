package com.lara;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class J 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("hello" ,120);
		map.put("test" ,220);
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		map.put("end",10000);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

/*
Exception in thread "main" java.util.ConcurrentModificationException
-Those are not allowing concurrent modification
*/