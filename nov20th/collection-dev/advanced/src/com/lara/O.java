package com.lara;

import java.util.ArrayDeque;

public class O
{
	public static void main(String[] args) 
	{
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.add("abc");
		ad.add("xyz");
		ad.addFirst("first");
		ad.add("end");
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}
}

/*
- u can add and remove from both the directions

[first, abc, xyz, end]
first
[abc, xyz, end]
end
[abc, xyz]


*/