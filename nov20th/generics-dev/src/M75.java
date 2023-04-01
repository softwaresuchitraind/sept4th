import java.util.ArrayList;
class M75 
{
	static void test(ArrayList<?> list)
	{
		list.add(90);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		test(list);
		list.add(20);
		System.out.println(list);
	}
}

/*

cte
add() argument is a Generic type


-if it is wildcard 
- Vector and Hash table are Synchronized---multiple Threads
are not allowing
we can use in the multithreaded environment


*/