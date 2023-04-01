import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Manager28
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(23);
		list.add(49);
		list.add(15);
		Comparator ctr = Collections.reverseOrder();
		Collections.sort(list, ctr);
		int i = Collections.binarySearch(list, 22, ctr);
		System.out.println(list);
		System.out.println(i);
		i = Collections.binarySearch(list, 23, ctr);
		System.out.println(i);	
	}
}

/*
[49, 30, 23, 20, 15, 10]
-4
2

-If at all ArrayList is sorted in reverse order then third argument should be Comparator.

*/
