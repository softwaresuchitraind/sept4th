package com.lara;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class R 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		Collection<String> list1 = Collections.unmodifiableList(list);
		list1.add("xyz");
		System.out.println(list1);
	}
}


/*

-Once list can be convered into unmodifiableList u can not add,remove etc
UnsupportedOperationException
*/
