import java.util.ArrayList;
import java.util.Collections;
public class Manager27
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("blue");
		list.add("yellow");
		list.add("indigo");
		list.add("red");
		Collections.sort(list);
		System.out.println(list);
		int i = Collections.binarySearch(list, "violet");
		System.out.println(i);
	}
}

/*
[blue, indigo, red, yellow]
-4

-binary search always require a sorting
-without sorting we can not do binary search.

What is the significance of that negetive number ?

-if it is color it will be between blue and indigo
-for binary search it is considering sorted one.

for abc it is -1

*/
