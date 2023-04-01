import java.util.ArrayList;
import java.util.Iterator;
class M6 
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
		list.add(50);

		System.out.println(list);
	}
}
/*
rs-Because of after iteration running is success.
*/