import java.util.ArrayList;
public class Manager11
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(3);
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
}

/*
[9, 0, 4, 6, 8, 2, 1, 3]
[]

clear()-------making arraylist empty
*/