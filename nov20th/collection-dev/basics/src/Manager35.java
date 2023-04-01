import java.util.ArrayList;
import java.util.Iterator;
public class Manager35
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		Iterator it = list.iterator();	
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		list.add(50);
		System.out.println(list);
		
	}
}

/*

90
9
0
40
[90, 9, 0, 40, 50]


- once Iteration got over we can do any updateable operation.

*/
