import java.util.PriorityQueue;
class M28  
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(null);
		queue.add(0);
		queue.add(200);
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
/*
NullPointerException
-internally call Comparable method.
-we can not store null value in PriorityQueue


-Whereever sorting is there null should not be.

G:\nov20th\collection-dev\basics\src>java -cp ../classes M28
Exception in thread "main" java.lang.NullPointerException
        at java.util.PriorityQueue.offer(PriorityQueue.java:336)
        at java.util.PriorityQueue.add(PriorityQueue.java:322)
        at M28.main(M28.java:10)

*/