import java.util.*;
class M49
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(901);
		list.add(920);
		System.out.println(list);
		System.out.println(list.peekLast());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
	}
}

/*

reading and removing last

G:\sept4th\collection-dev\src>java -cp ../classes M49
[90, 910, 190, 901, 920]
920
[90, 910, 190, 901, 920]
920
[90, 910, 190, 901]


Linkedlist also a type of List and also a type of Queue.


priorityqueue implements queue.It is autosorting like treemap and treeset.



*/
