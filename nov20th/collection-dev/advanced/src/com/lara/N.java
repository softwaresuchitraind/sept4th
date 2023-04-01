package com.lara;

import java.util.ArrayDeque;

public class N 
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("abc");
		ad.add("xyz");
		ad.addFirst("first");
		ad.add("end");
		System.out.println(ad);
	}
}

/*

Deque--Double ended queue
Double ended Queue --u can add in the 1st ---u can add in the last

adding and delteing both can happen in both the ends'

*/
