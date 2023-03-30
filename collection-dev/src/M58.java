import java.util.*;
class M58

{

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1000);
		queue.add(2000);
		queue.add(3000);
		queue.addFirst(10);
		queue.addFirst(20);
		System.out.println(queue);
	}
}


/*

[20, 10, 1000, 2000, 3000]

double ended queue
Adding both the sides , reading also both the sides.

*/