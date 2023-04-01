import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class A
{
	int i, j;
	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "(" +i+ "," +j+ ")";
	}
}

class M73
{
	public static void main(String[] args) 
	{
		ArrayList<A> list = new ArrayList<>();
		list.add(new A(90, 10));
		list.add(new A(0, 910));
		list.add(new A(9, 0));
		list.add(new A(910, 20));
		list.add(new A(190, 500));
		System.out.println(list);
		Collections.sort(list, (A a1, A a2) ->  a1.i - a2.i);
		System.out.println(list);
		Collections.sort(list, ( a1, a2) -> a1.j - a2.j);
		System.out.println(list);
	}
}

/*

[(90,10), (0,910), (9,0), (910,20), (190,500)]
[(0,910), (9,0), (90,10), (190,500), (910,20)]
[(9,0), (90,10), (910,20), (190,500), (0,910)]
*/