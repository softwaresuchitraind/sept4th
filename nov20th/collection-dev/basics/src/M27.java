import java.util.PriorityQueue;
class M27  
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(0.0);
		queue.add(0);
		queue.add(200);
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
/*

G:\nov20th\collection-dev\src>javac -d ../classes M27.java
Note: M27.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\nov20th\collection-dev\src>java -cp ../classes M27
Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double
        at java.lang.Double.compareTo(Double.java:49)
        at java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:657)
        at java.util.PriorityQueue.siftUp(PriorityQueue.java:648)
        at java.util.PriorityQueue.offer(PriorityQueue.java:345)
  
		at java.util.PriorityQueue.add(PriorityQueue.java:322)
        at M27.main(M27.java:10)
-collection api is only for objects not for primitives
-Interger of objects can not be converted into double object.

*/