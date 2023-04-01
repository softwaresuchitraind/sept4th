import java.util.ArrayList;
import java.util.ListIterator;
class M17
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(10);
		list.add(40);
		list.add(80);
		ListIterator it = list.listIterator(); 
		Object obj = null;
		while(it.hasNext())
		{
			System.out.println(it.previousIndex());
			obj = it.next();
			if(obj.equals(40))
			{
				it.set(50);
			}
			System.out.println(obj);
			System.out.println(it.nextIndex());
		}
		System.out.println(list);
	}
}

// it is replacing 40 with 50
/*

Diffence between Iterator and ListIterator
----------------------------------------
-Iterator contains some basic operation like reading in the forword and remove
-through listIterator we can go for previous and next() etc

*/