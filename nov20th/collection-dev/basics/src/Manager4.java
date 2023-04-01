import java.util.ArrayList;
class Manager4 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9.0);
		list.add(190);
		list.add(910);
		list.add("abc");
		System.out.println(list);
		System.out.println("-----");
		for(int i =0; i<list.size();i++)
		{
			System.out.print(list.get(i)+ ",");
		}
		System.out.println();
		System.out.println("-------");
		for(Object obj:list)
		{
			System.out.print(obj+ ",");
		}
		System.out.println();
		System.out.println("-----------");
	}
}


/*
[90, 9.0, 190, 910, abc]
-----
90,9.0,190,910,abc,
-------
90,9.0,190,910,abc,
-----------


Reading and printing content of ArrayList

1-toString()
2-clasical for loop ---size() and get()
3-enhanced for loop




*/