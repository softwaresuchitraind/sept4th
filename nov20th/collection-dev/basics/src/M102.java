import java.util.ArrayList;

class M102
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = 
					new ArrayList<Integer>();
		list.add(90);
		list.add(9.5);
		list.add("abc");
		System.out.println(list);
		Object obj = list.get(1);
		System.out.println(obj);
		double d1 = (double)list.get(2);
		System.out.println(d1);
	}
}

/*

compile time errors rather than warnings

as it has information that ArrayList contains only
integers not any other types


*/