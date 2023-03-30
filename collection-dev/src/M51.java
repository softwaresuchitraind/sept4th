import java.util.*;
class M51
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(901);
		queue.add(920.9);
		queue.add(0);
		queue.add(100);
		queue.add(500);
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

cte
whereever sorting there is only one type of element not the multiple tyy[pe cof element
*/