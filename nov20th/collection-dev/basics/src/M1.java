import java.util.ArrayList;
import java.util.Iterator;


class M1 
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
		}
		System.out.println(list);
	}
}

/*
Iterator is a interface ,it is containing 3 methods
1. hasNext()
2. next()
3.remove()

-As it is a interface we can not create an Object by using new Operator

list.iterator()
-Designing anonymous inner class which is subclass to interface
-it pointing to an object taht is subclass to Iterator that is Anonymous inner class

-Iterator is  not a container,Array list is a container.
-Arraylist elemets are not copying into Iterator.
-Iterator is a pointer which is pointing to elements of ArrayList.
-while calling it.hasNext(),it is checking whether elements avilable in the Arraylist or not.
-while calling it.next(), it is reading element from the ArrayList only.


*/
