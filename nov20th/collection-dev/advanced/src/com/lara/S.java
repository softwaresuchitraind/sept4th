package com.lara;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
public class S
{
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		Collection<String> set1 = Collections.unmodifiableSet(set);
		set1.add("xyz");
		System.out.println(set1);
	}
}

/*
Exception in thread "main" java.lang.UnsupportedOperationException
*/
