import java.util.*;
class M48 
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
		System.out.println(list.peek());// just reading the 1st element
		System.out.println(list);
		System.out.println(list.poll());// reading and removing the 1st element
		System.out.println(list);
	}
}

/*
G:\sept4th\collection-dev\src>java -cp ../classes M48
[90, 910, 190, 901, 920]
90
[90, 910, 190, 901, 920]
90
[910, 190, 901, 920]
*/
