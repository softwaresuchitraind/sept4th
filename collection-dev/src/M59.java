import java.util.*;
class M59

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
		System.out.println(queue.pollLast());
		System.out.println(queue);
		System.out.println(queue.pollFirst());
		System.out.println(queue);
	}
}


/*
G:\sept4th\collection-dev\src>java -cp ../classes M59
[20, 10, 1000, 2000, 3000]
3000
[20, 10, 1000, 2000]
20
[10, 1000, 2000]


both the sides we can read and both the sides we can add


*/