import java.util.ArrayList;
class Manager16 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(60);
		list.add(40);
		list.add(20);
		System.out.println(list.contains(60));
		System.out.println(list.contains(80));
	}
}

/*

true
false

-it checks whether the given element is available or not.
*/
