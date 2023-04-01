import java.util.TreeSet;
class M49
{
	public static void main(String[] args) 
	{
		TreeSet set = new TreeSet();
		set.add(90);
		set.add(0);
		set.add(10);
		set.add(null);
		set.add(190);
		System.out.println(set);
	}
}

/*
NullPointerException

-No null element is inside TreeSet
-if any nullvalue it should not be whereever sorting is there -internally calling compateTo()

*/