import java.util.LinkedList;
class M22
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		
	}
}
/*

[90, 910, 190, 20]
90
[910, 190, 20]


poll() method reading and removing head element
*/