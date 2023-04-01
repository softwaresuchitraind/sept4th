import java.util.ArrayList;
import java.util.Iterator;
class M2 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);
	}
}
/*
reading and removing elements from the ArrayList
*/