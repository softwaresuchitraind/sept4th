import java.util.PriorityQueue;
import java.util.Comparator;
class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
 	}
}

class M32
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue(new Comparator()
							{
								public int compare(Object o1,Object o2)
									{
											return ((A)o1).i -((A)o2).i;
									}	
		
							});
		queue.add(new A(90));
		queue.add(new A(910));
		queue.add(new A(190));
		queue.add(new A(56));
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}

/*
[i = 56, i = 90, i = 190, i = 910]
i = 56
-Through Anonymous inner class we are implementing Comparable interface
*/