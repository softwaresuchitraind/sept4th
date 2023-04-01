import java.util.ArrayList;
public class Manager1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();//creating an object
		list.add(90);
		list.add(9.9);
		list.add("abc");
		list.add(true);
		System.out.println(list);
	}
}

/*

[90, 9.9, abc, true]


-In case of collection Api we do not require to specify the size any number of elements can be
stored.

-ArrayList argument is Object type-- u have to supply derived datatype.
-In every Collection API class toString() method got overided.
so we get content of state/content of the ArrayList rather than memory address.

-It is not limited to one type of element --any number of element and any type of element can be added.






*/