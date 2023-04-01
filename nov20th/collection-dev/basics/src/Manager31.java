 import java.util.ArrayList;
import java.util.Iterator;
public class Manager31
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
			System.out.print(it.next());
		}
		System.out.println("----");
		System.out.println("-----------");
		while(it.hasNext())
		{
			System.out.print(lit.next());
		}
		
	}
}

/*


Cte
By using same Iterator we can iterate maximum one time
-It is not possible for second time

intially pointer is @ 0,it keep moving from left to right
As pointer or cursor is at the right side.


*/
