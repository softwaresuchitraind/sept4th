import java.util.*;
class M57

{
	static class A 
	{
		int i;
		A(int i)
		{
			this.i = i;
		}
		public String toString()
		{
			return "(i= " +i+ ")";
		}
		public int compareTo(Object o)
		{
			return i - ((A)o).i;
		}

	}
	public static void main(String[] args) 
	{
		PriorityQueue<A> queue = new PriorityQueue<>((o1,o2) -> o1.i - o2.i);
		queue.add(new A(90));
		queue.add(new A(0));
		queue.add(new A(9));
		queue.add(new A(910));
		queue.add(new A(190));
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}


/*
G:\sept4th\collection-dev\src>java -cp ../classes M56
[(i= 0), (i= 90), (i= 9), (i= 910), (i= 190)]
(i= 0)
[(i= 0), (i= 90), (i= 9), (i= 910), (i= 190)]
(i= 0)
[(i= 9), (i= 90), (i= 190), (i= 910)]
(i= 9)
[(i= 90), (i= 910), (i= 190)]



* No downcasting require while using generics
*/