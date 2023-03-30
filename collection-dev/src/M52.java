import java.util.*;
class M52
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(901);
		queue.add(null);
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
G:\sept4th\collection-dev\src>java -cp ../classes M52
Exception in thread "main" java.lang.NullPointerException
        at java.util.PriorityQueue.offer(PriorityQueue.java:336)
        at java.util.PriorityQueue.add(PriorityQueue.java:322)
        at M52.main(M52.java:11)

whereever sorting null is not allowed.
*/