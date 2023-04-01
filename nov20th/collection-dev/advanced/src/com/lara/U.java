package com.lara;
import java.util.WeakHashMap;

class Test
{
	protected void finalize() throws Throwable
	{
		System.out.println("removed");
	}
}
public class  U
{
	public static void main(String[] args) 
	{
		WeakHashMap<Test, Integer> map = new WeakHashMap<>();
		Test t1 = new Test();
		map.put(t1, 12);
		t1 = null;
		System.gc();
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(map);
	}
}


/*
WeakHashMap
-It is elgible for garbage collection even though Test object is avaliable by calling
System.gc()---if it is HashMap it is not eligible for Garbage Collection.
*/