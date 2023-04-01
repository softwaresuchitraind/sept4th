import java.util.ArrayList;

class M103
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = 
					new ArrayList<Integer>();
		//list.add(90);
		//list.add(9);
		//list.add(300);
		System.out.println(list);
		Object obj = list.get(0);
		System.out.println(obj);
		//int d1 = list.get(2);
		//System.out.println(d1);
	}
}

/*
[90, 9, 300]
9
300

no downcasting
*/