import java.util.ArrayList;
public class Manager8
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(0);
		list1.add(9);
		list1.add(94);
		System.out.println(list1);
		ArrayList list2 = new ArrayList(list1);
		list2.add("abc");
		System.out.println(list2);
	}
}


/*

[90, 0, 9, 94]
[90, 0, 9, 94, abc]

-while defining arraylist we can specift any existing ArrayList 
in the constructor.



*/