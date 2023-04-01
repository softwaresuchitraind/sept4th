
import java.util.ArrayList;
import java.util.Collections;
class C
{
	int i;
	C(int i)
	{
		this.i =i;
	}
	public String toString()
	{
		return "i =" +i;
	}
}
public class Manager23
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new C(9));
		list.add(new C(19));
		list.add(new C(4));
		list.add(new C(10));
		list.add(new C(8));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*

ClassCastException
--------------------
We can not compare one object with other object in straight way
-u can not use sort() straight way while comapring objects
-Every string implents comparable interface.
-If Objects of type Comparable then it is eligible for Comparision.

*/
