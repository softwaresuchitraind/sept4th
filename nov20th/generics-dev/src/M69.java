import java.util.ArrayList;
class M69 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(901);
		System.out.println(list);
		int i = list.get(2);
		System.out.println(i);
	}
}


/*
[90, 910, 190, 901]
190

only integer allowed
*/