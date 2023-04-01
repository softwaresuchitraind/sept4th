package com.lara;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class T
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 11);
		Map<String, Integer> map1 = Collections.unmodifiableMap(map);
		map1.put("xyz", 22);
		System.out.println(map1);
	}
}

/*

Exception in thread "main" java.lang.UnsupportedOperationException
*/