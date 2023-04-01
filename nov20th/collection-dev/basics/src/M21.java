import java.util.LinkedList;
class M21
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		
	}
}

/*

[90, 910, 190, 20]
90
[90, 910, 190, 20]


LinkedList is not only a type of List--is also a type of Queue
peek() method only reading not removing

peek() method reading the 1st element.

*/