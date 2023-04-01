package com.lara;

import java.util.HashMap;
import java.util.TreeMap;

public class  C
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("ramu", 10);
		map.put("pavan", 20);
		map.put("swathi", 20);
		map.put("vijay", 20);
		map.put("ramana", 20);
		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(map);
		System.out.println(map1);
	}
}

/*

{swathi=20, ramu=10, ramana=20, pavan=20, vijay=20}
{pavan=20, ramana=20, ramu=10, swathi=20, vijay=20}


using Generics key choosing as String and value choosing as Integer.
*/