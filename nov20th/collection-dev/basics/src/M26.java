import java.util.PriorityQueue;
import java.util.Collections;
class M26  
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = 
			new PriorityQueue(Collections.reverseOrder());
		queue.add(90);
		queue.add(910);
		queue.add(190);
		queue.add(20);
		queue.add(0);
		queue.add(200);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}

/*
[910, 90, 200, 20, 0, 190]
910
[200, 90, 190, 20, 0]
200
[190, 90, 0, 20]

- it is sorting 1st element which is maximum element

does not require to sort any other element-unnecessary operation is avoiding.

*/