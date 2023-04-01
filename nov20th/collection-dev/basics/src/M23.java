import java.util.LinkedList;
class M23
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(20);
		System.out.println(list);
		System.out.println(list.get(list.size()-1));
		System.out.println(list);
		
	}
}

/*
size() is for total number of element
last element we are simple reading.



[90, 910, 190, 20]
20
[90, 910, 190, 20]


*/