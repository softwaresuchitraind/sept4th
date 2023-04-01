import java.util.LinkedList;
class M24
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.removeLast());
		System.out.println(list);
		
	}
}


/*
// it is only stack
//By using Linkedlist we can achive every function of stack and queue

[90, 910, 190, 20]
20
[90, 910, 190]

*/