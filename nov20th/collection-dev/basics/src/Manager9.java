import java.util.ArrayList;
public class Manager9
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);
		Object obj = list.remove(3);
		System.out.println(list);
		System.out.println(obj);
		obj = list.remove(10);
		System.out.println(obj);
	}
}


/*
[9, 0, 4, 6, 8, 2, 1, 3]
[9, 0, 4, 8, 2, 1, 3]
6
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 7
        at java.util.ArrayList.rangeCheck(ArrayList.java:657)
        at java.util.ArrayList.remove(ArrayList.java:496)
        at Manager9.main(Manager9.java:19)




*/