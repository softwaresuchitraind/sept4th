package com.lara;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Z2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> x = new ArrayList<>();
		x.add("abc");
		x.add("xyz");
		x.add("abc");
		x.add("xyz");
		x.add("abc");
		x.add("xyz");
		System.out.println(x);
		Set<String> z = new HashSet<>(x);
	}
}
