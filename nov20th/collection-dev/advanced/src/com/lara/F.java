package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class F 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list = Collections.synchronizedList(list);
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		System.out.println(list);

		Set<Integer> set = new HashSet<Integer>();
		set = Collections.synchronizedSet(set);
		set.add(90);
		set.add(9);
		set.add(9010);
		System.out.println(set);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map = Collections.synchronizedMap(map);
		map.put("abc", 22);
		map.put("abc1", 222);
		map.put("abc1", 212);
		System.out.println(map);
		
	}
}

/*
[abc, xyz, hello]
[9010, 9, 90]
{abc1=212, abc=22}

-Built-in approches synchronized ArrayList,HashSet,HashMap

-Syncronizing Arraylist,HashSet and HashMap we have to use Syncronize*() method


Developing our own synchronised Arraylist

*/