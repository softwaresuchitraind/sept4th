import java.util.TreeSet;
class M48 
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(9.00);
		set.add(190);
		System.out.println(set);
	}
}


/*
classCastException

Three conditions
-every element of the TreeSet should be one type not multiple type

*/