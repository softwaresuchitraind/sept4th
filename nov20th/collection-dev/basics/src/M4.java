import java.util.ArrayList;
import java.util.Iterator;
class M4 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		Iterator it = list.iterator();
		Object obj = null;
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
		while(it.hasNext())
		{
			obj = it.next();
			System.out.println(obj);
		}
			
		System.out.println(list);
	}
}
/*
through Iterator we can read all the elements only one time --not more than one time
even though we are iterating two times-printing one time
one it is cover hasNext element returns false only.
*/