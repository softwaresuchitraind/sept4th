import java.util.ArrayList;
class Manager5 
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(0);
		list1.add("abc");
		System.out.println(list1);
		list1.add("xyz");
		System.out.println(list1);
		list1.add(2,"check");
		System.out.println(list1);
	}
}



/*
[90, 0, abc]
[90, 0, abc, xyz]
[90, 0, check, abc, xyz]


-add() method got overloaded.
-1st add() taking one argument which is Object type.
-if u want to add in the middle u have to specify index no
*/