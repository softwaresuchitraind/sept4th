import java.util.ArrayList;
class Manager15 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(80);
		list.add(60);
		list.add(20);
		System.out.println(list);
		list.set(2,"abc");
		System.out.println(list);
	}
}

/*
[90, 80, 60, 20]
[90, 80, abc, 20]


-set() is used for replacing an element at the specified index.
*/
