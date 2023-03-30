import java.util.*;
class M50
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(901);
		queue.add(920);
		queue.add(0);
		queue.add(100);
		queue.add(500);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}


/*
G:\sept4th\collection-dev\src>java -cp ../classes M50
[0, 500, 90, 901, 920, 190, 100, 910]
0
[0, 500, 90, 901, 920, 190, 100, 910]
0
[90, 500, 100, 901, 920, 190, 910]

perfect queue-Auto sorted queue

*/