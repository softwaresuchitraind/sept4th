import java.util.ArrayList;
import java.util.Collections;
class D implements Comparable
{
	int i;
	D(int i)
	{
		this.i =i;
	}
	public String toString()
	{
		return "i =" +i;
	}
	public int compareTo(Object obj)
	{
		return i-((D)obj).i;
	}
}
public class Manager24
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new D(9));
		list.add(new D(0));
		list.add(new D(8));
		list.add(new D(2));
		list.add(new D(5));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

/*

[i =9, i =0, i =8, i =2, i =5]
[i =0, i =2, i =5, i =8, i =9]

*/