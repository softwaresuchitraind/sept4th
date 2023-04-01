import java.util.ArrayList;
import java.util.Collections;
class Manager17
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(19);
		list.add(91);
		list.add(29);
		list.add(2);
		list.add(25);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*

[9, 19, 91, 29, 2, 25]
[2, 9, 19, 25, 29, 91]

in order to sort the element use built in class
Collections--it is a utility class where u can find sort method

Two classes from the Util package
*/
